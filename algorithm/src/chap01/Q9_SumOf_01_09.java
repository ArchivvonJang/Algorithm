package chap01;

import java.util.Scanner;

public class Q9_SumOf_01_09 {
	// Q9 정수 a, b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 아래 메서드를 작성하라
	static int sumof(int a, int b) {
		int max; //가장 큰 수를 담을 변수
		int min; // 가장 작은 수를 담을 변수
		int sum = 0; // min부터 max사이의 모든 정수의 합을 담을 변수
		
		// a와b 비교
		if(a<b) {
			max=b;
			min=a;
		}else {
			max=a;
			min=b;
		}
		
		// for문을 이용해서 전부 더하기
		for (int i = min; i <= max; i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("a와 b를 포함하여 그 사이의 모든 정수의 합을 구한다.");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("a->"); 
		int a = scan.nextInt();
		System.out.println("b->");
		int b = scan.nextInt();
		
		System.out.println("a = "+ a +" 와 b = "+ b + "사이의 모든 정수의 합은 " + sumof(a,b));
	}
}
