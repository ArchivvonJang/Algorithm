package chap01;

import java.util.Scanner;

public class JudgeSign {
	//조건판단과 분기 
	// 실습 1-3 - 정수의 부호를 판단하여 줄력하는 프로그램
	
	// 입력한 정수가 양수인지 음수인지 0인지 판단
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" 정수를 입력하세요 -->");
		int n  = scan.nextInt();
		
		// 부호 판단하기
		if(n>0) {
			System.out.println(n +" 은 양수입니다.");
		}
		else if(n<0) {
			System.out.println(n + " 은 음수입니다.");
		}
		else {
			System.out.println("0입니다.");
		}
	}
	
	// 연산자와 피연산자
	/*
	 * 연산자 operator : +,-,/,*,<,>,=,..
	 * 피연산자 operand 
	 * 조건연산자 conditional operator :  ?
	 * -> 자바에서 유일한 3항 연산자 
	 * 식a?b:c 가 true이면 b를 return, false면 c를 return
	 * ex) a = (x>y)?x:y; (x>y)가 참이면 return x, 거짓이면 return y
	 * */
}
