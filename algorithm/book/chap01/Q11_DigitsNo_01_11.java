package chap01;

import java.util.Scanner;

public class Q11_DigitsNo_01_11 {
	//양의 정수를 입력하고 자릿수를 출력하는 프로그램
	//예 ) 153 -> '그 수는 3자리입니다.' 1314->'그 수는 4자리 입니다.'
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n=0; // 정수 
		
		do {
			System.out.print("n -> ");
			n = scan.nextInt();
		}while(n<=0); // n은 양의 정수여야함
		
		int no = 0; //자릿수를 담을 변수 
		while(n>0) { //10으로 나눈 n의 값이 0보다는 클 때까지 반복
			n/=10; // n을 10으로 나눈다. 
			no++; 
		}
		System.out.println("정수는"+no+"자리수입니다.");
		
		
		
	}
}
