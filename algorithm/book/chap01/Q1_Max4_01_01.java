package chap01;

import java.util.Scanner;

public class Q1_Max4_01_01 {
	//Q1
	// 네 값의 최대값을 구하는 max4 메소드를 작성하세요.
	static int max4(int a, int b, int c, int d) {
		
		int max= a;
		
		if(b>max) max = b;
		if(c>max) max = c;
		if(d>max) max = d;
		
		return max;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 int a,b,c,d;
		 
		 System.out.println("네 개의 정수 중 최대 값을 구합니다.");
		 System.out.println("a -> ");
		 a = scan.nextInt();
		 System.out.println("b -> ");
		 b = scan.nextInt();
		 System.out.println("c -> ");
		 c = scan.nextInt();
		 System.out.println("d -> ");
		 d = scan.nextInt();
		 
		 int max = max4(a,b,c,d); // a,b,c,d의 최대값/  메소드 max4 불러오기~~
		 System.out.println("최대값은 "+max +" 입니다.");
	}
}
