package chap02;

import java.util.Iterator;
import java.util.Scanner;

//Q3 �迭 a�� ��� ����� �հ踦 ���Ͽ� ��ȯ�ϴ� �޼��带 �ۼ��ϼ���.(p.61)
public class Q3_ {
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return (sum);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��� ���� : ");
		int num = scan.nextInt();
		
		int[] a = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("a["+i+"]");
			a[i] = scan.nextInt();
		}
		
		System.out.println("��ü �հ�� "+sumOf(a)+"�Դϴ�.");
	}
}
