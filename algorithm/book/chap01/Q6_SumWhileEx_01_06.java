package chap01;

import java.util.Scanner;

public class Q6_SumWhileEx_01_06 {
	//Q6. �ǽ� 1-4���� while���� ����� �� ���� i ���� n+1�� ���� Ȯ���ϼ���. (���� i ���� ����ϵ��� ���α׷��� ����)
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1���� n�� �� ���ϱ�");
		System.out.println("n -> ");
		int n = scan.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while(i<=n) { // i�� n���ϸ� �ݺ�
			sum+=i; //sum + i
			i++; //i + 1 

		}
		
		System.out.println("1���� " + n +" �� ���� "+ sum);
		System.out.println("i �� " + i);
	}
}
