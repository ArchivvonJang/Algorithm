package chap01;

import java.util.Scanner;

public class Median {
	//실습 1C - 1 : 세 값의 중앙값
	
	// 3개의 정수값을 입력하고 중앙값을 구한 다음 출력
	static int med3(int a, int b, int c) {
		if(a>=b)
			if(b>=c)
				return b;
			else if (a<=c)
				return a;
			else 
				return c;
		else if(a>c)
			return a;
		else if(b>c)
			return c;
		else 
			return b;
	
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.println("a ->");
		int a = scan.nextInt();
		System.out.println("b ->");
		int b = scan.nextInt();
		System.out.println("c ->");
		int c = scan.nextInt();
		
		System.out.println("중앙 값은 "+ med3(a,b,c));
		
		// 세 값의 중앙 값을 구하는 과정 -> 퀵정렬 에서도 이용가능
		
//		연습1-5 중앙값을 구하는 메소드는 아래와 같이 작성할 수 있다. 하지만 위의 메소드보다 효율이 떨어지는데 그 이유는?
//		가장 처음의 if문의 판단
//		if ((b >= a && c<= a) || (b <= a && c >= a))
//		에 주목합니다. 여기서 b >= a 및 b <= a의 판단을 뒤집은 판단(실질적으로 같은 판단)을 이어지는 else 이후의 
//		else if ((a > b && c < b) || (b <= a && c > b))
//		으로 수행합니다. 결국 가장 처음의 if가 성립한 경우 2 번째의 if에서도 (실질적으로)같은 판단을 수행하므로 효율이 나빠집니다.

	}
}
