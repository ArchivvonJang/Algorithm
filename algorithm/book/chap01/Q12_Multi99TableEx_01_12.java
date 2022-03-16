package chap01;

public class Q12_Multi99TableEx_01_12 {
 //Q12 위쪽과 왼쪽의 곱하는 수가 있는 곱셈표를 출력하는 프로그램을 작성하세요.
	 public static void main(String[] args) {
		 System.out.print("  |");
		 
		 //위쪽 곱하는 수 표시
		 for(int i=1; i<=9; i++) 
			 System.out.printf("%3d",i); //공백+두자리수를 표현하기위해 3%d 지시자 사용
		 System.out.println("\n---+------------------------------");
		 
		 // 곱셈표 출력
		 for(int i=1; i<=9;i++) {
			//왼쪽 곱하는 수 표시
			 System.out.printf("%2d |", i); //
			 
			 // 곱셈표 결과 
			 for(int j=1; j<=9; j++)
				 System.out.printf("%3d",i*j); //가로 결과 출력
			 System.out.println();// 줄나누기
		 }
		 
	 }
}
