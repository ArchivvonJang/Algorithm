package chap02;
//�Ҽ��� ����
// � ���� ������ �Ҽ��� ��� �����ϴ� �˰���
// 2���� n-1������ � �����ε� ������ �������� �ʽ��ϴ�. 
public class PrimeNumber1 {
	//p.72
	// 1000������ �Ҽ��� ���� (ver.1)
	public static void main(String args) {
		int counter=0; //������ Ƚ��
		
		for(int n = 2; n<=1000; n++) {
			int i ;
			for(i=2; i<n; i++) {
				counter++;
				if(n%i==0) // ����������� �Ҽ��� �ƴ�
					break;//���̻� �ݺ��� ���ʿ�
			}
			if(n==i) //���������� ����������� ����
				System.out.println(n);
		}
		
		System.out.println("�������� ������ Ƚ�� :" + counter);
	}
	
}
