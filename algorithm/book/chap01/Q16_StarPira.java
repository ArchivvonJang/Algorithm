package chap01;

import java.util.Scanner;

public class Q16_StarPira {
 //Q16. n���� �Ƕ�̵带 ����ϴ� �޼��带 �ۼ��ϼ���.
	//i�࿡�� (i-1)*2+1���� ��ȣ���� *�� ��µǰ� �ϼ���. 
	static void spira(int n) {
		
		for (int i = 1; i <=n ; i++) { // ���� n ��
			//����� ��
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print(" "); //������ ���� ������ ���� �ﰢ��
			}
			for (int j = 1; j <= (i-1)*2+1; j++) { //���� ������ 1,3,5,6,7..������ Ȧ�������� �����ϹǷ� ���� j ���� (2�� ���) +1
				System.out.print("*");
			}
			System.out.println(); //�ٹٲ�
		}
		
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("[�Ƕ�̵� *���]");

		int n;
		do {
			System.out.print("�� : ");
			n=scan.nextInt();
		}while(n<=0); // n�� ��������Ѵ�. �ƴϸ� �ݺ�
		
		spira(n);
	}
}
