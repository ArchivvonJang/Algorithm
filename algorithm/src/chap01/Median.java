package chap01;

import java.util.Scanner;

public class Median {
	//�ǽ� 1C - 1 : �� ���� �߾Ӱ�
	
	// 3���� �������� �Է��ϰ� �߾Ӱ��� ���� ���� ���
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
		
		System.out.println("�� ������ �߾Ӱ��� ���մϴ�.");
		System.out.println("a ->");
		int a = scan.nextInt();
		System.out.println("b ->");
		int b = scan.nextInt();
		System.out.println("c ->");
		int c = scan.nextInt();
		
		System.out.println("�߾� ���� "+ med3(a,b,c));
		
		// �� ���� �߾� ���� ���ϴ� ���� -> ������ ������ �̿밡��
		
//		����1-5 �߾Ӱ��� ���ϴ� �޼ҵ�� �Ʒ��� ���� �ۼ��� �� �ִ�. ������ ���� �޼ҵ庸�� ȿ���� �������µ� �� ������?
//		���� ó���� if���� �Ǵ�
//		if ((b >= a && c<= a) || (b <= a && c >= a))
//		�� �ָ��մϴ�. ���⼭ b >= a �� b <= a�� �Ǵ��� ������ �Ǵ�(���������� ���� �Ǵ�)�� �̾����� else ������ 
//		else if ((a > b && c < b) || (b <= a && c > b))
//		���� �����մϴ�. �ᱹ ���� ó���� if�� ������ ��� 2 ��°�� if������ (����������)���� �Ǵ��� �����ϹǷ� ȿ���� �������ϴ�.

	}
}
