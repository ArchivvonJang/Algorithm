package chap01;

import java.util.Scanner;

public class Q17_NumPira {
	//Q17. n���� ���� �Ƕ�̵带 ����ϴ� �޼ҵ带 �ۼ��ϼ���
	static void npira(int n) {
		for (int i = 1; i <=n ; i++) { //���� �ܼ�
			for (int j = 1; j <= n-i+1 ; j++) { //���� ����� ������ ���� ���ﰢ�� 
				System.out.print(" ");
			}
			for (int j = 1; j <= (i-1)*2+1; j++) { // ���� �Ƕ�̵�
				System.out.print(i); //* ��ſ� i 
			}
			System.out.println();//�ٹٲ�
		}
	}
	public static void main(String[] args) {
		System.out.println("[���� �Ƕ�̵�]");
		
		Scanner scan = new Scanner(System.in);
		int n;
		do {
			System.out.print("�� : ");
			
			n = scan.nextInt();
		}while(n<=0); //n�� 0���� ū ����
		
		//�Ƕ�̵� ��� �޼ҵ� ȣ��
		 npira(n);
		
	}
}
