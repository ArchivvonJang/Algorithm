package chap01;

import java.util.Scanner;

public class SumFor {
	// �ǽ� 1-5 for�� �ݺ�
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[1���� n���� ���� for���� �̿��� ���Ѵ�.]");
		System.out.println("n -> ");
		int n = scan.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum+=i;
		}
		System.out.println("1���� " + n + "�� ���� " + sum);
	}
	
	//�ϳ��� ������ ����ϴ� �ݺ����� while���� for���� ����ϴ� ���� ����.
}
