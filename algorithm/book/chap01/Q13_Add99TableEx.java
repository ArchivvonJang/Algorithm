package chap01;

public class Q13_Add99TableEx {
 //Q13. ������ �ƴ϶� ������ ����ϴ� ���α׷�
	// ���ʰ� ���ʿ� ���ϴ� ���� ����ϼ���.
	public static void main(String[] args) {
		System.out.print("  |");
		
		// ���ʿ� ���ϴ� �� 
		for(int i=1; i<=9;i++) {
			System.out.printf("%3d",i);
		}
		System.out.println("\n----------------------------------");
		
		//�����ʿ� ���ϴ� �� �� ����ǥ
		for (int i = 1; i <= 9; i++) {
			//�����ʿ� ���ϴ� �� 
			System.out.printf("%2d |",i);
			
			//i+j
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i+j); // ���� ��� ���� ���
			}
			System.out.println();//�ٹٲ�
		}
	}
}
