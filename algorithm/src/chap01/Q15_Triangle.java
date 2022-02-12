package chap01;

import java.util.Scanner;

public class Q15_Triangle {
 //Q15 ���� �̵ �ﰢ���� ����ϴ� �κ��� �Ʒ��� ���� ������ �޼ҵ�� �ۼ��ϼ���.
	/*
	 *1. ���� �Ʒ��� ������ �̵ �ﰢ��
	 *2. ���� ���� ������ �̵ �ﰢ��
	 *3. ������ ���� ������ �̵ �ﰢ��
	 *4. ������ �Ʒ��� ������ �̵ �ﰢ��
	 * */
	static void triangleLB(int n) {
	//1. ���� �Ʒ��� ������ �̵ �ﰢ��
		
		for(int i=1; i<=n; i++) {
			for (int j = 1; j <= i; j++) { // i�� 
				System.out.print("*"); // i���� *�� ��Ÿ��
			}
			System.out.println(); //�ٹٲ�
		}

	}
	static void triangleLU(int n) {
	//2. ���� ���� ������ �̵ �ﰢ��
		
		for (int i = 1; i <= n ; i++) {
			for (int j = 1; j <= n-i+1; j++) { //n-i+1���� *
				System.out.print("*");
			}
			System.out.println();//�ٹٲ�
		}
	}
	static void triangleRU(int n) {
	//3. ������ ���� ������ �̵ �ﰢ��
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" "); //i-1���� ����""
			}
			for (int j = 1; j <= n-i+1; j++) {
				System.out.print("*"); //������ ������ �ڸ��� n-i+1���� '*'�� ��Ÿ��
			}
			System.out.println(); //�ٹٲ�
		}
	}
	static void striangleRB(int n) {
	//4. ������ �Ʒ��� ������ �̵ �ﰢ��
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(" "); //n-i ���� ����
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();//�ٹٲ�
		}
	}
	
	public static void main(String[] args) {
		//n�� �Է¹��� ��ĳ��
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.println("----- *�� �̿��� �ﰢ�� ����� -----");
		
		do {
			System.out.print("n �� �� : ");
			n= scan.nextInt();
		}while(n<=0); // n�� �����̰ų� 0�̸� �ٽ�
		
		System.out.println("[1. ���� �Ʒ��� ������ �̵ �ﰢ��]");
		triangleLB(n);
		
		System.out.println("[2. ���� ���� ������ �̵ �ﰢ��]");
		triangleLU(n); 
		
		System.out.println("3. ������ ���� ������ �̵ �ﰢ��]");
		triangleRU(n);
		
		System.out.println("[4. ������ �Ʒ��� ������ �̵ �ﰢ��]");
		striangleRB(n); 
	}
}
