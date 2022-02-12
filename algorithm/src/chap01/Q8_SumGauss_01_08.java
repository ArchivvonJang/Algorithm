package chap01;

import java.util.Scanner;

public class Q8_SumGauss_01_08 {
 //Q8 1부터 10까지의 합은 (1+10)*5와 같은 방법으로 가훌 수 있다. 
	// 가우스의 덧셈이라는 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성하세요.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("n->");
		int n = scan.nextInt();
		
		int sum; // 전체 합
		sum = (1+n)*(n/2); // 맨 앞과 맨 끝 정수의 합
		if(n%2==1) { //정수를 2로 나눈 몫이 1이라면 n은 홀수 , 그리고 남은 1개의 홀수를 더하는 선택문
			sum += (n+1)/2;
		}
		//다른 식 : sum = (n+1)*(n/2)+(n&2==1?(n+1)/2:0);
		
		System.out.println("가우디 덧셈을 활용한 1부터 " + n + "까지의 합은 " + sum);
	}
}
