package chap01;

import java.util.Scanner;

public class Q8_SumGauss_01_08 {
 //Q8 1���� 10������ ���� (1+10)*5�� ���� ������� ���� �� �ִ�. 
	// ���콺�� �����̶�� ����� �̿��Ͽ� 1���� n������ ���� ���� ���ϴ� ���α׷��� �ۼ��ϼ���.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("n->");
		int n = scan.nextInt();
		
		int sum; // ��ü ��
		sum = (1+n)*(n/2); // �� �հ� �� �� ������ ��
		if(n%2==1) { //������ 2�� ���� ���� 1�̶�� n�� Ȧ�� , �׸��� ���� 1���� Ȧ���� ���ϴ� ���ù�
			sum += (n+1)/2;
		}
		//�ٸ� �� : sum = (n+1)*(n/2)+(n&2==1?(n+1)/2:0);
		
		System.out.println("����� ������ Ȱ���� 1���� " + n + "������ ���� " + sum);
	}
}
