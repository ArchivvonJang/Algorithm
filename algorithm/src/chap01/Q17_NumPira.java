package chap01;

import java.util.Scanner;

public class Q17_NumPira {
	//Q17. n단의 숫자 피라미드를 출력하는 메소드를 작성하세요
	static void npira(int n) {
		for (int i = 1; i <=n ; i++) { //세로 단수
			for (int j = 1; j <= n-i+1 ; j++) { //왼쪽 상단이 직각인 공백 역삼각형 
				System.out.print(" ");
			}
			for (int j = 1; j <= (i-1)*2+1; j++) { // 숫자 피라미드
				System.out.print(i); //* 대신에 i 
			}
			System.out.println();//줄바꿈
		}
	}
	public static void main(String[] args) {
		System.out.println("[숫자 피라미드]");
		
		Scanner scan = new Scanner(System.in);
		int n;
		do {
			System.out.print("단 : ");
			
			n = scan.nextInt();
		}while(n<=0); //n은 0보다 큰 정수
		
		//피라미드 찍는 메소드 호출
		 npira(n);
		
	}
}
