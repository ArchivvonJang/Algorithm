package chap01;

import java.util.Scanner;

public class Q2_Min3_01_02 {
	static int min3(int a, int b, int c) {
		int min = a;
		if(b<min)  min = b;
		if(c<min) min = c;
		return min;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("세 정수의 최소값을 구합니다");
		System.out.println("a ->"); 
		a = scan.nextInt();
		System.out.println("b -> ");
		b = scan.nextInt();
		System.out.println("c -> ");
		c = scan.nextInt();
		
		int min = min3(a,b,c); // 입력받은 a,b,c의 최소값을 구하는 메소드 min3을 호출 
		System.out.println("최소값은 " + min +"입니다.");
	}
}
