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
		
		System.out.println("�� ������ �ּҰ��� ���մϴ�");
		System.out.println("a ->"); 
		a = scan.nextInt();
		System.out.println("b -> ");
		b = scan.nextInt();
		System.out.println("c -> ");
		c = scan.nextInt();
		
		int min = min3(a,b,c); // �Է¹��� a,b,c�� �ּҰ��� ���ϴ� �޼ҵ� min3�� ȣ�� 
		System.out.println("�ּҰ��� " + min +"�Դϴ�.");
	}
}
