package chap01;

import java.util.Scanner;

public class Q10_difference_01_10 {
	public static void main(String[] args) {
		//Q10 두 변수 a,b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하세요. (단 b>a)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("a -> ");
		int a = scan.nextInt();
		int b = 0;
		while(true){
			System.out.print("b -> ");
			b = scan.nextInt();
			
			if(b>a) 
				break;
			System.out.println("a보다 큰 값을 입력하세요.");
			
		}
		System.out.println("a는 "+ a +" b는 " + b + " b-a는 "+ (b-a));
		
	}
}
