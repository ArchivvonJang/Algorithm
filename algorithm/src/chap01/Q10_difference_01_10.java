package chap01;

import java.util.Scanner;

public class Q10_difference_01_10 {
	public static void main(String[] args) {
		//Q10 �� ���� a,b�� ������ �Է��ϰ� b-a�� ����ϴ� ���α׷��� �ۼ��ϼ���. (�� b>a)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a -> ");
		int a = scan.nextInt();
		int b = 0;
		while(true){
			System.out.print("b -> ");
			b = scan.nextInt();
			
			if(b>a) 
				break;
			System.out.println("a���� ū ���� �Է��ϼ���.");
			
		}
		System.out.println("a�� "+ a +" b�� " + b + " b-a�� "+ (b-a));
		
	}
}
