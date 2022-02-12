package chap01;

import java.util.Scanner;

public class Q6_SumWhileEx_01_06 {
	//Q6. 실습 1-4에서 while문이 종료될 때 변수 i 값이 n+1이 됨을 확인하세요. (변수 i 값을 출력하도록 프로그램을 수정)
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 n의 합 구하기");
		System.out.println("n -> ");
		int n = scan.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i<=n) { // i가 n이하면 반복
			sum+=i; //sum + i
			i++; //i + 1 

		}
		
		System.out.println("1부터 " + n +" 의 합은 "+ sum);
		System.out.println("i 는 " + i);
	}
}
