package chap01;

import java.util.Scanner;

public class Q14_Square {
 //Q14 �Է��� ���� �� ������ �ϴ� ���簢���� * ��ȣ�� ����ϴ� ���α׷��� �ۼ��ϼ���.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[*�� �̿��Ͽ� �簢���� ����մϴ�.]");
		System.out.print("�� �� : ");
		int num = scan.nextInt();
		
		for (int i = 0; i < num; i++) { //���� *
			System.out.print("*");
			for (int j = 0; j < num; j++) { //���� *
				System.out.print("*");
			}
			System.out.println();//����
		}
	}
}
