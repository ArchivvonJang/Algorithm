package chap01;

import java.util.Scanner;

public class Q7_SumForEx_01_07 {
	public static void main(String[] args) {
		//Q7 �ǽ� 1-5 �� �����Ͽ� n = 7�̸� 1+2+3...+7= 28 �� ����ϴ� ���α׷��� �ۼ��ϼ���.
		
		//int n=7;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("n -> ");
		int n = scan.nextInt();
		
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i);
			sum+=i; // sum + i
		}
		System.out.println(" = "+ sum);
		
	}
}
