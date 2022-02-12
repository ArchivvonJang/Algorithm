package chap02;

import java.util.Scanner;

public class MaxOfArray {
	// traverse (�ֻ�) : �迭�� ��Ҹ� �ϳ��� ���ʷ� ���캸�� ����
	// �迭����� �ִ밪�� ���ϴ� �޼���
	
	static int maxOf(int[] a){
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max) max=a[i];
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������� Ű �ִ밪�� ���մϴ�.");
		
		System.out.print("��� ��(�迭�� ũ��)-->");
		int num=scan.nextInt(); //�迭�� ��� ������ �Է¹���
		
		// �迭 ����, �迭�� ��Ҵ� num
		int[] height = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("height["+i+"] (�� �迭�� ��)---> ");
			height[i] = scan.nextInt(); //�迭�� ��� ��
		}
		System.out.println("�ִ밪�� "+maxOf(height));
	}
	
	//���������� : ��ü�� ����� ���� ������ ����
	/* public : ��� ���� ��� (Ŭ����, ������, �������, �޼���)
	 * protected : ���� ��Ű��(����)�� ��ü, ��Ӱ����� ��ü ���(������, �������, �޼���)
	 * default : ���� ��Ű��(����)�� ��ü ��� (Ŭ����, ������, �������, �޼���)
	 * private : ���� ��ü�ȿ����� ��� (������, �������, �޼���)
	 * ���������� ���������ڸ� ����� �� ����
	 * */
}
