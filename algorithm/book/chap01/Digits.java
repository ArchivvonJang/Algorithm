package chap01;

import java.util.Scanner;

public class Digits {
	// ������ ���α׷��� : �ϳ��� �Ա��� �ϳ��� �ⱸ�� ���� ������Ҹ��� ���������� ��ġ�Ͽ� ���α׷��� �����ϴ� ���
	// 3������ �����帧: ����, ����, �ݺ�
// �ǽ� 1c-2 : 2�ڸ��� ���(10~99)�� �Է��մϴ�.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		System.out.println("2�ڸ� ������ �Է��ϼ���.");
		
		do {
			System.out.print("���� �Է� : ");
			num=scan.nextInt();
		}while(num<10||num>99); //���� num�� 10���� ���� 1�ڸ������̰ų�, 99���� ū 3�ڸ� �����̸�, �ٽ� �ݺ� 
	// == !(num >= 10 && num <= 99)
	// ��𸣰��� ��Ģ : �� ������ �����ϰ� ������ ��������, ������ �������� �ٲٰ� �ٽ� ��ü�� �����ϸ� ������ ���ǰ� ���� ��� ��Ģ	
		System.out.println("num �� ���� "+num);
	}
	
	
}
