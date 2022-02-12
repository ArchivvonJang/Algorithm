package chap01;

import java.util.Scanner;

public class Q14_Square {
 //Q14 입력한 수를 한 변으로 하는 정사각형을 * 기호로 출력하는 프로그램을 작성하세요.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[*을 이용하여 사각형을 출력합니다.]");
		System.out.print("단 수 : ");
		int num = scan.nextInt();
		
		for (int i = 0; i < num; i++) { //세로 *
			System.out.print("*");
			for (int j = 0; j < num; j++) { //가로 *
				System.out.print("*");
			}
			System.out.println();//공백
		}
	}
}
