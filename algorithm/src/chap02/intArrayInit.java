package chap02;
//p.46

public class intArrayInit {
	//�迭 �ʱ�ȭ(array initializer) : �迭 ��ü�� ������ ���ÿ� �� ����� �ʱ�ȭ
	
	// ���� �ڷ����� int���� �迭 (���� ��� ���� 5 : �迭 �ʱ��ڿ� ���� ����)
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5}; //�迭�� �ʱ��ڿ� ���� ����
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}
