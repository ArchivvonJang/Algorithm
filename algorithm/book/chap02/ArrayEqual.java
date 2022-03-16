package chap02;

import java.util.Scanner;

public class ArrayEqual {
	// �� �迭 a, b�� ��� ��Ұ� ������?
	
	static boolean equals(int[] a, int[] b) {
		if(a.length!=b.length)
			return false;
		
		for (int i = 0; i < b.length; i++) {
			if(a[i]!=b[i])
				return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�迭 a�� ��ڼ� : ");
		int na = scan.nextInt();
		
		int[] a = new int[na]; // �迭 a�� �Է¹��� na���� ��ڼ��� ����
		
		for (int i = 0; i < na; i++) {
			System.out.println("a["+i+"] : ");
			a[i]=scan.nextInt();
		}
		
		System.out.print("�迭 b�� ��ڼ� : ");
		int nb = scan.nextInt(); //�迭 b�� ��ڼ�
		
		int[] b = new int[nb]; // �迭 b�� �Է¹��� nb���� ��ڼ��� ����
		
		for (int i = 0; i < nb; i++) {
			System.out.print("b["+i+"] : ");
			b[i] = scan.nextInt();
		}
		
		System.out.println("�迭 a�� b�� "+ (equals(a,b)? "����.":"���� �ʴ�."));
	
	}
}
