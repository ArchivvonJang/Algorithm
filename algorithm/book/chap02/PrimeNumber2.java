package chap02;

public class PrimeNumber2 {
//p.75
	//3�� �Ҽ����� �Ǵ��ϴ� ���� n=3
	//���� for���� ������� �ʰ� if���� ���� n���� prime[1]�� ����˴ϴ�.
	public static void main(String[] args) {
		int counter = 0; //������ Ƚ��
		int ptr = 0; //ã�� �Ҽ��� ����
		int[] prime = new int[500]; //�Ҽ��� �����ϴ� �迭
		
		prime[ptr++] = 2; //2�� �Ҽ� 
		
		//����� Ȧ����
		for(int n=3; n<=1000; n+=2) {
			int i;
			for (i = 1; i < ptr; i++) { //�̹� ã�� �Ҽ� ptr�� ������ 
				counter++;
				if(n % prime[i]==0) // ����������� �Ҽ��� �ƴ�
					break; //�Ҽ��� �ƴ϶�� �ݺ� ���߱�
			}//for i end
			if(ptr == i) { //���������� ����������� ����
				prime[ptr++]=n; //�������� �����ϴ� �������� n�� �Ҽ��̹Ƿ� �迭�� ����  <-- ptr�� ���� 1, for���� ����� i<ptr ��, (1<1)�� �������� �����Ƿ� for���� �������� �ʴ´�. ���⿡ if���� ����� ptr==i ��, (1==1)�� ���̹Ƿ� prime[ptr++]�� n�� ����
			}//if ptr end
		} // for end
		for(int i = 0; i < ptr; i++) {
			System.out.println(prime[i]); //ã�� ptr���� �Ҽ��� ���
		} // for end
			
		System.out.println("�������� ������ Ƚ�� : " + counter);	
			
	
	}
}
