package chap01;

import java.util.Scanner;

public class JudgeSign {
	//�����Ǵܰ� �б� 
	// �ǽ� 1-3 - ������ ��ȣ�� �Ǵ��Ͽ� �ٷ��ϴ� ���α׷�
	
	// �Է��� ������ ������� �������� 0���� �Ǵ�
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" ������ �Է��ϼ��� -->");
		int n  = scan.nextInt();
		
		// ��ȣ �Ǵ��ϱ�
		if(n>0) {
			System.out.println(n +" �� ����Դϴ�.");
		}
		else if(n<0) {
			System.out.println(n + " �� �����Դϴ�.");
		}
		else {
			System.out.println("0�Դϴ�.");
		}
	}
	
	// �����ڿ� �ǿ�����
	/*
	 * ������ operator : +,-,/,*,<,>,=,..
	 * �ǿ����� operand 
	 * ���ǿ����� conditional operator :  ?
	 * -> �ڹٿ��� ������ 3�� ������ 
	 * ��a?b:c �� true�̸� b�� return, false�� c�� return
	 * ex) a = (x>y)?x:y; (x>y)�� ���̸� return x, �����̸� return y
	 * */
}
