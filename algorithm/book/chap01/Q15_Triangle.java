package chap01;

import java.util.Scanner;

public class Q15_Triangle {
 //Q15 직각 이등변 삼각형을 출력하는 부분을 아래와 같은 형식의 메소드로 작성하세요.
	/*
	 *1. 왼쪽 아래가 직각인 이등변 삼각형
	 *2. 왼쪽 위가 직각인 이등변 삼각형
	 *3. 오른쪽 위가 직각인 이등변 삼각형
	 *4. 오른쪽 아래가 직각인 이등변 삼각형
	 * */
	static void triangleLB(int n) {
	//1. 왼쪽 아래가 직각인 이등변 삼각형
		
		for(int i=1; i<=n; i++) {
			for (int j = 1; j <= i; j++) { // i행 
				System.out.print("*"); // i개의 *을 나타냄
			}
			System.out.println(); //줄바꿈
		}

	}
	static void triangleLU(int n) {
	//2. 왼쪽 위가 직각인 이등변 삼각형
		
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= n-i+1; j++) { //n-i+1개의 *
				System.out.print("*");
			}
			System.out.println();//줄바꿈
		}
	}
	static void triangleRU(int n) {
	//3. 오른쪽 위가 직각인 이등변 삼각형
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" "); //i-1개의 공백""
			}
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print("*"); //공백을 제외한 자리에 n-i+1개의 '*'를 나타냄
			}
			System.out.println(); //줄바꿈
		}
	}
	static void striangleRB(int n) {
	//4. 오른쪽 아래가 직각인 이등변 삼각형
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "); //n-i 개의 공백
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();//줄바꿈
		}
	}
	
	public static void main(String[] args) {
		//n을 입력받을 스캐너
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("----- *을 이용한 삼각형 만들기 -----");
		
		do {
			System.out.print("n 의 값 : ");
			n= scan.nextInt();
		}while(n<=0); // n이 음수이거나 0이면 다시
		
		System.out.println("[1. 왼쪽 아래가 직각인 이등변 삼각형]");
		triangleLB(n);
		
		System.out.println("[2. 왼쪽 위가 직각인 이등변 삼각형]");
		triangleLU(n); 
		
		System.out.println("3. 오른쪽 위가 직각인 이등변 삼각형]");
		triangleRU(n);
		
		System.out.println("[4. 오른쪽 아래가 직각인 이등변 삼각형]");
		striangleRB(n); 
	}
}
