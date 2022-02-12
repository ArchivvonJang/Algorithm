package chap01;

import java.util.Scanner;

class Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); // System.in 은 키보드와 연결된 표준입력스트림(standard input stream)
		 //입력받은 세개의 정숫값 가운데 '최대값'을 구하는 프로그램
		System.out.println("세정수의 최댓값을 구합니다.");
		// 변수 a,b,c에 들어가는 값은 Scanner를 통해 키보드로 입력받는다.
		System.out.println("a 값 -> "); int a = stdIn.nextInt();
		System.out.println("b 값 -> "); int b = stdIn.nextInt();
		System.out.println("c 값 -> "); int c = stdIn.nextInt();
		
		 // 순차적 (concatenation) 구조 : 프로스세가 순차적으로 실행되는 구조
		int max = a; //비교를 통해 최대값으로 정할 새로운 변수 max / max 에 a값을 넣는다.
		
		// 선택(selection)구조 : 식의 평가 결과에 따라 프로그램의 실행호름을 변경하는 if문
		if(b>max) max = b; // b값이 max보다 크면 max에 b값을 넣는다.
		if(c>max) max = c; // c값이 max보다 크면 max에 c값을 넣는다.
		
		 System.out.println("최대값은 "+max+" 입니다." );
		 
		

	}
}
