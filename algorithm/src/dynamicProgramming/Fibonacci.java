package dynamicProgramming;

public class Fibonacci {

	//동적계획법이 적용되지 않은 피보나치 수열
	public int fibonacci(int n) {
		if(n == 1 || n == 2) {
			return 1;
		}else {
			return fibonacci(n -1) + fibonacci(n - 2);
		}
	}
	
	//동적계획법
	public int dynamicFibonacci(int n) {
		int[] f = null;
		
		if(f[n] != 0) {
			return f[n]; //저장된 값이 있다면 값 반환
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
