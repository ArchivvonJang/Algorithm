package chap01;

public class Q13_Add99TableEx {
 //Q13. 곱셈이 아니라 덧셈을 출력하는 프로그램
	// 위쪽과 왼쪽에 더하는 수를 출력하세요.
	public static void main(String[] args) {
		System.out.print("  |");
		
		// 위쪽에 더하는 수 
		for(int i=1; i<=9;i++) {
			System.out.printf("%3d",i);
		}
		System.out.println("\n----------------------------------");
		
		//오른쪽에 더하는 수 와 덧셈표
		for (int i = 1; i <= 9; i++) {
			//오른쪽에 더하는 수 
			System.out.printf("%2d |",i);
			
			//i+j
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i+j); // 덧셈 결과 가로 출력
			}
			System.out.println();//줄바꿈
		}
	}
}
