package chap01;

import java.util.Scanner;

public class Q1_Max4_01_01 {
	//Q1
	// �� ���� �ִ밪�� ���ϴ� max4 �޼ҵ带 �ۼ��ϼ���.
	static int max4(int a, int b, int c, int d) {
		
		int max= a;
		
		if(b>max) max = b;
		if(c>max) max = c;
		if(d>max) max = d;
		
		return max;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int a,b,c,d;
		 
		 System.out.println("�� ���� ���� �� �ִ� ���� ���մϴ�.");
		 System.out.println("a -> ");
		 a = scan.nextInt();
		 System.out.println("b -> ");
		 b = scan.nextInt();
		 System.out.println("c -> ");
		 c = scan.nextInt();
		 System.out.println("d -> ");
		 d = scan.nextInt();
		 
		 int max = max4(a,b,c,d); // a,b,c,d�� �ִ밪/  �޼ҵ� max4 �ҷ�����~~
		 System.out.println("�ִ밪�� "+max +" �Դϴ�.");
	}
}
