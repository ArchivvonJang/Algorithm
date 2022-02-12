package chap01;

import java.util.Scanner;

public class Q16_StarPira {
 //Q16. n단의 피라미드를 출력하는 메세드를 작성하세요.
	//i행에는 (i-1)*2+1개의 기호문자 *가 출력되게 하세요. 
	static void spira(int n) {
		
		for (int i = 1; i <=n ; i++) { // 세로 n 단
			//공백과 별
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print(" "); //왼쪽이 위가 직각인 공백 삼각형
			}
			for (int j = 1; j <= (i-1)*2+1; j++) { //별의 갯수가 1,3,5,6,7..순으로 홀수값으로 증가하므로 가로 j 값은 (2의 배수) +1
				System.out.print("*");
			}
			System.out.println(); //줄바꿈
		}
		
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("[피라미드 *찍기]");

		int n;
		do {
			System.out.print("단 : ");
			n=scan.nextInt();
		}while(n<=0); // n은 양수여야한다. 아니면 반복
		
		spira(n);
	}
}
