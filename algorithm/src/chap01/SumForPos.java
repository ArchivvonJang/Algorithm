package chap01;

import java.util.Scanner;
// do_while
public class SumForPos {
//�ǽ� 1-6 ����� �Է��ϱ�
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		System.out.println("[1���� n������ ����� �ո� ���մϴ�.]");
		// n�� ���� 0 ���Ϸ� �Է��ϸ�, �ٽ� n�� ���� �Է¹޴´�.
		do {
			System.out.println("n ->");
			n = scan.nextInt();
		}while(n<=0); // n�� 0���� Ŭ ������ �ݺ��Ѵ�.
		
		int sum =0;
		
		for(int i = 0; i <= n ; i++) {
			sum += i; // sum �� i ���ϱ�
		}
		System.out.println("sum-> "+sum);
		
		
		// do while  ���� ������ �� �� ������ ������ ��� �ݺ��� �������� �Ǵ��ϴ� ���� �Ǵ� �ݺ���
		
		
		/* ���� �Ǵ� �ݺ��� ���� �Ǵ� �ݺ��� ������
		 * �����Ǵ� �ݺ���: while, for ó���� ������� ���� ����� 0�̸� ���� ���� ������� �ʴ´�.
		 * �����Ǵ� �ݺ���: do while ������ �ݵ�� �� ���� ����ȴ�.
		 * */
	}
}
