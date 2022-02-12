package chap01;

import java.util.Scanner;
// do_while
public class SumForPos {
//실습 1-6 양수만 입력하기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.println("[1부터 n까지의 양수의 합만 구합니다.]");
		// n의 값을 0 이하로 입력하면, 다시 n의 값을 입력받는다.
		do {
			System.out.println("n ->");
			n = scan.nextInt();
		}while(n<=0); // n이 0보다 클 때까지 반복한다.
		
		int sum =0;
		
		for(int i = 0; i <= n ; i++) {
			sum += i; // sum 에 i 더하기
		}
		System.out.println("sum-> "+sum);
		
		
		// do while  루프 본문을 한 번 실행한 다음에 계속 반복할 것인지를 판단하는 사후 판단 반복문
		
		
		/* 사전 판단 반복과 사후 판단 반복의 차이점
		 * 사전판단 반복문: while, for 처음에 제어식을 평가한 결과가 0이면 루프 본문 실행되지 않는다.
		 * 사후판단 반복문: do while 본문이 반드시 한 번은 실행된다.
		 * */
	}
}
