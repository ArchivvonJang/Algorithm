package dynamicProgramming;

public class Fibonacci {

	//������ȹ���� ������� ���� �Ǻ���ġ ����
	public int fibonacci(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}else {
			return fibonacci(n -1) + fibonacci(n - 2);
		}
	}
	
	//������ȹ��
	public int dynamicFibonacci(int n) {
		int[] f = null;
		
		if(f[n] != 0) {
			return f[n]; //����� ���� �ִٸ� �� ��ȯ
		}else {
			if(n==1|| n==2) {
				f[n] = 1;
			}else {
				f[n] = fibonacci(n-1) + fibonacci(n-2);
			}
			return f[n];
		}
	}
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci(); 
		
		System.out.printf("%d", f.fibonacci(80));

	}

}
