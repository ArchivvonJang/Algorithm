package chap01;

public class Q12_Multi99TableEx_01_12 {
 //Q12 ���ʰ� ������ ���ϴ� ���� �ִ� ����ǥ�� ����ϴ� ���α׷��� �ۼ��ϼ���.
	 public static void main(String[] args) {
		 System.out.print("  |");
		 
		 //���� ���ϴ� �� ǥ��
		 for(int i=1; i<=9; i++) 
			 System.out.printf("%3d",i); //����+���ڸ����� ǥ���ϱ����� 3%d ������ ���
		 System.out.println("\n---+------------------------------");
		 
		 // ����ǥ ���
		 for(int i=1; i<=9;i++) {
			//���� ���ϴ� �� ǥ��
			 System.out.printf("%2d |", i); //
			 
			 // ����ǥ ��� 
			 for(int j=1; j<=9; j++)
				 System.out.printf("%3d",i*j); //���� ��� ���
			 System.out.println();// �ٳ�����
		 }
		 
	 }
}
