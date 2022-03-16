package chap01;

import java.util.Scanner;

public class SumFor {
	// 실습 1-5 for문 반복
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[1부터 n까지 합을 for문을 이용해 구한다.]");
		System.out.println("n -> ");
		int n = scan.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum+=i;
		}
		System.out.println("1부터 " + n + "의 합은 " + sum);
	}
	
	//하나의 변수를 사용하는 반복문은 while보다 for문을 사용하는 것이 좋다.
}
