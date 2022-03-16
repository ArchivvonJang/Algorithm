package chap01;

import java.util.Scanner;

public class Q3_Min4_01_03 {
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		if(d<min) min = d;
		return min;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,d;
		System.out.println("네 정수의 최소값을 구합니다.");
		System.out.println("a -> ");
		a = scan.nextInt();
		System.out.println("b -> ");
		b = scan.nextInt();
		System.out.println("c -> ");
		c = scan.nextInt();
		System.out.println("d -> ");
		d = scan.nextInt();
		
		int min = min4(a,b,c,d);
		
		System.out.println("네 정수의 최소값은 "+ min);
		
	}
}
