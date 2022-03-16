package chap02;

import java.util.Scanner;

//�迭 ���� ����
public class ReverseArray {
	//�迭 ��ҿ� ���� �а� �������� ����
	
	//�迭 ��� a[idx1]�� [idx2]�� ���� t�� �̿��� �ٲ�
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; //t�� idx1���� ����
		a[idx1] = a[idx2];  //idx1�� idx2�� ���������μ� idx2, idx2���� ��
		a[idx2]=t; //�ٽ� ���� idx2�� t�� ����, idx2 idx1�� ��
	}
	
	//�迭 a��Ҹ� �������� ����(for���� ��� ������ ���� ��Ī���� ��ȯ�Ǳ⶧���� ���������� ������ȴ�)
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++){
			swap(a, i, a.length-i-1); //a, idx1, idx2(�ѱ��̿��� i��°�� ���� 1�� ���Ѱ�) 
		}//for end
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// �迭�� ���̸� �Է¹޴´�.
		System.out.print("�迭�� ���� ��� ����: ");
		int num = scan.nextInt(); // == �迭 ����� ����
		
		int[] x = new int[num]; // ���̰� num-1�� �迭
		
		for(int i = 0; i<num; i++) {
			//�迭�� ��� ������ŭ ��� ���� �Է¹޴´�
			System.out.print("x["+i+"] -> ");
			x[i] = scan.nextInt();
		}//for end
		
		reverse(x); //��� reverse�޼ҵ忡 �迭x ���� --> �迭 a(x)�� ��Ҹ� �������� ����
		
		System.out.println("[�迭�� �������� ����]");
		for (int i = 0; i < num; i++) {
			System.out.println("reverse x["+i+"] = " +x[i] );
		}
	}
}


