package backjoon;

import java.io.*;
import java.util.Scanner;


//https://www.acmicpc.net/problem/10870
// ���� �Ǻ���ġ��5 
public class Fibonacci5 {
	
	//���� �Ǻ���ġ����
	public int fibonacci(int n) {
	    if (n == 0) {
	        System.out.println(0);
	        return 0;
	    } else if (n == 1) {
	        System.out.println(1);
	        return 1;
	    } else {
	    	return fibonacci(n -1) + fibonacci(n - 2);
	    }   
	}
	
	
	
	static int fibonacci2(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return fibonacci2(n -1) + fibonacci2(n - 2);
	}

	

	public static void main(String args[]) throws NumberFormatException, IOException {
		 
		//Fibonacci5 f5 = new Fibonacci5();
		//System.out.println(f5.fibonacci(10));
		
		//Scanner + ��͸� ����� Ǯ��
		Scanner in = new Scanner(System.in);
		//int n  = in.nextInt();
		
		//BufferedReader + ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(br.readLine()); // BufferedReader ���ڿ��� ��ȯ�ϱ� ������ Integer.parseInt() �޼ҵ带 ���� String -> int ����ȯ
		
		//Scanner + �迭
		int n = in.nextInt();
		int[] fib = new int [n + 1]; // f(0)���� �����ϹǷ� n + 1 ũ�� ����
		
		for (int i = 0; i < fib.length; i++) {
			//f(0), f(1) ���� 0, 1 �ʱ�ȭ
			if(i == 0) fib[0] = 0; 		// ( i = 0 �� ���) fibonacci[0] = fibonacci[-1] + fibonacci[-2]; 
			else if(i ==1) fib[1] = 1; 	// ( i = 1 �� ���) fibonacci[1] = fibonacci[0] + fibonacci[-1];
			else fib[0] = fib[i - 1] + fib[i - 2];
		}	
		System.out.println(fib[n]);
		
		
		
		
		//System.out.println(fibonacci2(n)); // �Է°� 10 ����� 55
		
		
		
		
	}

}
