package chap01;

import java.util.Scanner;

public class TriagngleLB {
	//���� �̵ �ﰢ�� ���
	// ���߷����� ������ ��ȣ�� �þ���Ƽ� ����� �̵ �ﰢ��
	// �ǽ� 1-8
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int n;
		 
		 System.out.println("[���� �Ʒ��� ������ �̵ �ﰢ��]");
		 
		 // �̵ �ﰢ���� �� ���� �Է�
		 do {
			 System.out.print("�ﰢ���� �� �� : ");
			 n = scan.nextInt();
		 }while(n<=0);// �Է¹��� ���ڰ� 0�̰ų� 0���� ������ �ݺ�
		 
		 // �Է¹��� �� ���� �̿��� ���� ����
		 for(int i=1; i<=n; i++) { //�ܼ���ŭ ���� ���
			 
			 //���� �� ��� 
			 for(int j=1; j<=i; j++) {
				 System.out.print("*"); // 1������ i(==n)�� ���� 
			 }
			 //�ٹٲ�
			 System.out.println();
		 }
	 }
}
