package chap02;

import java.util.Scanner;

//Q2. ������ó�� �迭��Ҹ� �������� �����ϴ� ������ �ϳ��ϳ� ��Ÿ���� ���α׷��� �ۼ��ϼ���.(p.61)
public class Q2_ReverseArrayEx_02_02 {
	
	//�迭�� �� i1�� i2�� ��ȯ
	static void swap(int[] a, int i1, int i2) {
		int t = a[i1];
		a[i1] = a[i2];
		a[i2] = t;
	}
	// ������ �迭 a �� ���
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();//�ٹٲ�
	}
	//�迭 a�� ��Ҹ� ���� ����
	static void reverse(int[] a) {
		for(int i = 0; i<a.length/2 ;i++) {
			System.out.println("[���� ���� ����]");
			System.out.println("a["+i+"] �� a["+(a.length-i-1)+"] �� ��ȯ�մϴ�.");
			swap(a, i, a.length-i-1);
			print(a); // ��� �޼ҵ� ���⼭ �θ���
		}
	}
	//�迭�� ��� ���� �Է¹ް� ���
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����� ���� : ");
		int num = scan.nextInt();
		
		int[] x = new int[num]; //��� ������ num�� �迭 x
		
		for (int i = 0; i < num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = scan.nextInt(); //�迭�� ��� �� �Է¹ޱ�
		}
		
		reverse(x);
		
		System.out.println("[�������� �����ϴ� ���� END]");
		for (int i = 0; i < num; i++) {
			System.out.println("x["+i+"] = "+x[i]);
		}
	}
	
}
