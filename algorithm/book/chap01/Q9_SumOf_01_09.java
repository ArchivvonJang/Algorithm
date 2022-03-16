package chap01;

import java.util.Scanner;

public class Q9_SumOf_01_09 {
	// Q9 ���� a, b�� �����Ͽ� �� ������ ��� ������ ���� ���Ͽ� ��ȯ�ϴ� �Ʒ� �޼��带 �ۼ��϶�
	static int sumof(int a, int b) {
		int max; //���� ū ���� ���� ����
		int min; // ���� ���� ���� ���� ����
		int sum = 0; // min���� max������ ��� ������ ���� ���� ����
		
		// a��b ��
		if(a<b) {
			max=b;
			min=a;
		}else {
			max=a;
			min=b;
		}
		
		// for���� �̿��ؼ� ���� ���ϱ�
		for (int i = min; i <= max; i++) {
			sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("a�� b�� �����Ͽ� �� ������ ��� ������ ���� ���Ѵ�.");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("a->"); 
		int a = scan.nextInt();
		System.out.println("b->");
		int b = scan.nextInt();
		
		System.out.println("a = "+ a +" �� b = "+ b + "������ ��� ������ ���� " + sumof(a,b));
	}
}
