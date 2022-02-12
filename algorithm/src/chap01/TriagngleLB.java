package chap01;

import java.util.Scanner;

public class TriagngleLB {
	//직각 이등변 삼각형 출력
	// 이중루프를 응용한 기호를 늘어놓아서 만드는 이등변 삼각형
	// 실습 1-8
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int n;
		 
		 System.out.println("[왼쪽 아래가 직각인 이등변 삼각형]");
		 
		 // 이등변 삼각형의 단 수를 입력
		 do {
			 System.out.print("삼각형의 단 수 : ");
			 n = scan.nextInt();
		 }while(n<=0);// 입력받은 숫자가 0이거나 0보다 작으면 반복
		 
		 // 입력받은 단 수를 이용한 이중 루프
		 for(int i=1; i<=n; i++) { //단수만큼 세로 출력
			 
			 //가로 별 출력 
			 for(int j=1; j<=i; j++) {
				 System.out.print("*"); // 1개부터 i(==n)개 까지 
			 }
			 //줄바꿈
			 System.out.println();
		 }
	 }
}
