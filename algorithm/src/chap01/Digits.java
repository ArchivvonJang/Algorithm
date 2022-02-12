package chap01;

import java.util.Scanner;

public class Digits {
	// 구조적 프로그래밍 : 하나의 입구와 하나의 출구를 가진 구성요소만을 계층적으로 배치하여 프로그램을 구성하는 방법
	// 3종류의 제어흐름: 순차, 선택, 반복
// 실습 1c-2 : 2자리의 양수(10~99)를 입력합니다.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("2자리 정수를 입력하세요.");
		
		do {
			System.out.print("정수 입력 : ");
			num=scan.nextInt();
		}while(num<10||num>99); //정수 num이 10보다 작은 1자리숫자이거나, 99보다 큰 3자리 숫자이면, 다시 반복 
	// == !(num >= 10 && num <= 99)
	// 드모르간의 밥칙 : 각 조건을 부정하고 논리곱을 논리합으로, 논리합을 논리곱으로 바꾸고 다시 전체를 부정하면 원래의 조건과 같다 라는 법칙	
		System.out.println("num 의 갑은 "+num);
	}
	
	
}
