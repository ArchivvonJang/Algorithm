package chap02;

import java.util.Scanner;

public class CardConvRev {
	//�����ȯ
	// �������� ������ ����� ��ȯ�ϴ� �˰���
	// 10���� ������ n���� ������ ��ȯ�Ϸ��� ������ n���� ���� �������� ���ϴ� ���ÿ� �� �� ���� ������ �ݺ� --> ���� �������� �Ųٷ� �þ�߸� ���� = ����� ��ȯ�� ����
	
	// �����ȯ�� �����ϴ� ���α׷� : �Է¹޴� 10������ 2����~36������ ��� ��ȯ�Ͽ� ��Ÿ��
	static int cardConvR(int x, int r, char[] d) {
		//���� �� x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �־�ΰ� �ڸ����� ��ȯ
		int digits=0; //��ȯ �� �ڸ��� 
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWZYZ"; // ����ȯ ���� �� �ڸ��� ���ڸ� char�� �迭 d�� �ֱ� 
		
		do {
			d[digits++] = dchar.charAt(x%r); // r�� ���� �������� ����, charAt �޼��� : ���ڿ����� ������ ���ڸ� �������ϱ� ���� String Ŭ����
			//1. ���� x�� r�� ���� �������� �ε����� �ϴ� ���ڸ� �迭 d ���[digits]�� �����ϰ� digits�� ���� ���� \
			x/=r; //2. x�� r�� ������.
		}while(x!=0); //x�� 0�� �ƴ� ������ 
		return digits;
	} // �迭�� �ִ� ���� �������� ���� (�迭 ���ʿ� �Ʒ��ڸ��� ��)
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int no; //��ȯ�ϴ� ����
		int cd; //���
		int dno; // ��ȯ �� �ڸ���
		int retry; // �ٽ� �� ��?
		char[] cno = new char[32]; // ��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ���� �迭
		
		System.out.println("[10������ �ٸ� ������ ��ȯ�մϴ�.]");
		do {
			System.out.println("===�����Է�===");
			do {
				System.out.print("��ȯ�� ���� : ");
				no=scan.nextInt();
			}while(no<0); //�����̸� �ٽ� 
			
			System.out.println("==��ȯ�� ���� �Է�==");
			do {
				System.out.print("� ������ ��ȯ�ұ��?(2~36) : ");
				cd=scan.nextInt();
			}while(cd<2||cd>36);
			
			dno = cardConvR(no, cd, cno); // no�� cd������ ��ȯ�ϴ� �޼ҵ忡 ����
			
			System.out.print(cd+"���� --> ");
			for (int i = dno-1; i>=0; i--) { //���ڸ����� ���ʴ�� ��Ÿ��
				System.out.print(cno[i]);
			}
			System.out.println();
			
			//�ٽ� �� ��?
			System.out.print("�� �� �� �ٲٰڽ��ϱ�? 1. ��/ 0. �ƴϿ�");
				retry= scan.nextInt();
		}while(retry==1);
	}
	//([.70)
}
