package chap01;

public class Max3m {
	// a,b,c �� �ִ밪�� ���Ͽ� ��ȯ�Ѵ�.
	static int max3(int a, int b, int c) {
		int max = a;
		if(b>max) max=b;
		if(c>max) max=c;
		
		return max; // ���� �ִ밪�� ȣ���� ������ ��ȯ
	}
	
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3,2,1)); //1. a>b>c
		System.out.println("max3(3,2,2) = " + max3(3,2,2)); //2. a>b=c
		System.out.println("max3(3,1,2) = " + max3(3,1,2)); //3. a>c>b
		System.out.println("max3(3,2,3) = " + max3(3,2,3)); //4. a=c>b
		System.out.println("max3(2,1,3) = " + max3(2,1,3)); //5. c>a>b
		System.out.println("max3(3,3,2) = " + max3(3,3,2)); //6. a=b>c
		System.out.println("max3(3,3,3) = " + max3(3,3,3));	//7. a=b=c
		System.out.println("max3(2,2,3) = " + max3(2,2,3));	//8. c>a=b
		System.out.println("max3(2,3,1) = " + max3(2,3,1));	//9. b>a>c
		System.out.println("max3(2,3,2) = " + max3(2,3,2));	//10. b>a=c
		System.out.println("max3(1,3,2) = " + max3(1,3,2));	//11. b>c>a
		System.out.println("max3(2,3,3) = " + max3(2,3,3));	//12. b=c>a
		System.out.println("max3(1,2,3) = " + max3(1,2,3));	//13. c>b>a
		
		/*
		 [�˰���] 
		 ������ �ذ��ϱ� ���� �� 
		 ��Ȯ�ϰ� ���ǵǰ� ������ �ִ� ���Ѱ��� ��Ģ���� �̷���� ����
		 */
		
		/*
		 * ������ ������ ����� �������� -> ����Ʈ�� (decision tree)
		 * */
	}
}