package chap01;

import java.util.Scanner;

public class SumWhile {
	//실습 1-4 while
	//1부터 n까지의 정수 합 구하기
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[1부터 입력받은 수 n까지의 합을 구한다.]");
		
		System.out.println("n ->");
		int n = scan.nextInt();
		
		// 합 구하기
		int sum = 0;
		int i = 1;
		
		while(i <= n){ //i가 n이하면 반복한다.
			sum += i; //sum에 i를 더한다.
			i++;	// i 값을 1만큼 증가시킨다.
		}
		System.out.println("1부터 " + n + "까지의 합은" + sum);
		
		//while문 반복
		/*
		 * 반복 (repetition)구조 == 루프 (loop)
		 * 어떤 조건이 성립하는 동안 처리를 반복하여 실행하는 것
		 * 
		 * while문은 실행 전에 반복을 계속할지 말지 판단하는데 이런 구조는 사전판단 반복구조
		 * */
	}
}
