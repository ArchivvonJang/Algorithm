package chap01;

import java.util.Scanner;

public class SumWhile {
	//�ǽ� 1-4 while
	//1���� n������ ���� �� ���ϱ�
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[1���� �Է¹��� �� n������ ���� ���Ѵ�.]");
		
		System.out.println("n ->");
		int n = scan.nextInt();
		
		// �� ���ϱ�
		int sum = 0;
		int i = 1;
		
		while(i <= n){ //i�� n���ϸ� �ݺ��Ѵ�.
			sum += i; //sum�� i�� ���Ѵ�.
			i++;	// i ���� 1��ŭ ������Ų��.
		}
		System.out.println("1���� " + n + "������ ����" + sum);
		
		//while�� �ݺ�
		/*
		 * �ݺ� (repetition)���� == ���� (loop)
		 * � ������ �����ϴ� ���� ó���� �ݺ��Ͽ� �����ϴ� ��
		 * 
		 * while���� ���� ���� �ݺ��� ������� ���� �Ǵ��ϴµ� �̷� ������ �����Ǵ� �ݺ�����
		 * */
	}
}
