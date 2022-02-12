package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	//������ ����� �迭�� ��ڰ� �����ϱ� : �� ��ҿ� ���� ���� (p.55)
	
	static int maxOf(int[] a) {
		int max= a[0];
		for (int i = 1; i < a.length; i++) 
			if(a[i]>max) 
				max=a[i];
			
		return max;
	}
	public static void main(String[] args) {
		Random ran = new Random(); //����
		Scanner scan = new Scanner(System.in); //�Է¹ޱ�
		
		System.out.println("[Ű�� �ִ밪�� ������ �迭�� �̿��� ���մϴ�.]");
		System.out.print("��� �� : "); //�迭�� ũ��
		int num = scan.nextInt();
		int[] height = new int[num]; // ��� ������ num�� �迭 ����
		
		System.out.println("[�� ����� Ű�� ��]");
		for (int i = 0; i < num; i++) { //num = height.length
			height[i] = 100 + ran.nextInt(90); // 90��(0 ~ 89)�� �������� ������
			System.out.println((i+1)+ "��° ��� => height["+i+"] : "+height[i]);
			
		}
	}
}
