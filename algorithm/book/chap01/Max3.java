package chap01;

import java.util.Scanner;

class Max3 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in); // System.in �� Ű����� ����� ǥ���Է½�Ʈ��(standard input stream)
		 //�Է¹��� ������ ������ ��� '�ִ밪'�� ���ϴ� ���α׷�
		System.out.println("�������� �ִ��� ���մϴ�.");
		// ���� a,b,c�� ���� ���� Scanner�� ���� Ű����� �Է¹޴´�.
		System.out.println("a �� -> "); int a = stdIn.nextInt();
		System.out.println("b �� -> "); int b = stdIn.nextInt();
		System.out.println("c �� -> "); int c = stdIn.nextInt();
		
		 // ������ (concatenation) ���� : ���ν����� ���������� ����Ǵ� ����
		int max = a; //�񱳸� ���� �ִ밪���� ���� ���ο� ���� max / max �� a���� �ִ´�.
		
		// ����(selection)���� : ���� �� ����� ���� ���α׷��� ����ȣ���� �����ϴ� if��
		if(b>max) max = b; // b���� max���� ũ�� max�� b���� �ִ´�.
		if(c>max) max = c; // c���� max���� ũ�� max�� c���� �ִ´�.
		
		 System.out.println("�ִ밪�� "+max+" �Դϴ�." );
		 
		

	}
}
