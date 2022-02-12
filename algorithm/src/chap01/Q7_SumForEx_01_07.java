package chap01;

import java.util.Scanner;

public class Q7_SumForEx_01_07 {
	public static void main(String[] args) {
		//Q7 실습 1-5 를 참고하여 n = 7이면 1+2+3...+7= 28 로 출력하는 프로그램을 작성하세요.
		
		//int n=7;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("n -> ");
		int n = scan.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i);
			sum+=i; // sum + i
		}
		System.out.println(" = "+ sum);
		
	}
}
