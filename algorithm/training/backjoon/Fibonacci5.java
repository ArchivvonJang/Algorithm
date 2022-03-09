package backjoon;

import java.io.*;
import java.util.Scanner;


//https://www.acmicpc.net/problem/10870
// 백준 피보나치수5 
public class Fibonacci5 {
	
	//기존 피보나치수열
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
		
		//Scanner + 재귀를 사용한 풀이
		Scanner in = new Scanner(System.in);
		//int n  = in.nextInt();
		
		//BufferedReader + 재귀
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int n = Integer.parseInt(br.readLine()); // BufferedReader 문자열을 반환하기 때문에 Integer.parseInt() 메소드를 통해 String -> int 형변환
		
		//Scanner + 배열
		int n = in.nextInt();
		int[] fib = new int [n + 1]; // f(0)부터 시작하므로 n + 1 크기 설정
		
		for (int i = 0; i < fib.length; i++) {
			//f(0), f(1) 각각 0, 1 초기화
			if(i == 0) fib[0] = 0; 		// ( i = 0 일 경우) fibonacci[0] = fibonacci[-1] + fibonacci[-2]; 
			else if(i ==1) fib[1] = 1; 	// ( i = 1 일 경우) fibonacci[1] = fibonacci[0] + fibonacci[-1];
			else fib[0] = fib[i - 1] + fib[i - 2];
		}	
		System.out.println(fib[n]);
		
		
		
		
		//System.out.println(fibonacci2(n)); // 입력값 10 결과값 55
		
		
		
		
	}

}
