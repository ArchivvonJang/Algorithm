package chap01;

import java.util.Scanner;

public class Q11_DigitsNo_01_11 {
	//���� ������ �Է��ϰ� �ڸ����� ����ϴ� ���α׷�
	//�� ) 153 -> '�� ���� 3�ڸ��Դϴ�.' 1314->'�� ���� 4�ڸ� �Դϴ�.'
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n=0; // ���� 
		
		do {
			System.out.print("n -> ");
			n = scan.nextInt();
		}while(n<=0); // n�� ���� ����������
		
		int no = 0; //�ڸ����� ���� ���� 
		while(n>0) { //10���� ���� n�� ���� 0���ٴ� Ŭ ������ �ݺ�
			n/=10; // n�� 10���� ������. 
			no++; 
		}
		System.out.println("������"+no+"�ڸ����Դϴ�.");
		
		
		
	}
}
