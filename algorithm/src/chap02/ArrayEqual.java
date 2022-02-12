package chap02;

import java.util.Scanner;

public class ArrayEqual {
	// 두 배열 a, b의 모든 요소가 같은가?
	
	static boolean equals(int[] a, int[] b) {
		if(a.length!=b.length)
			return false;
		
		for (int i = 0; i < b.length; i++) {
			if(a[i]!=b[i])
				return false;
		}
		
		return true;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수 : ");
		int na = scan.nextInt();
		
		int[] a = new int[na]; // 배열 a는 입력받은 na개의 요솟수를 가짐
		
		for (int i = 0; i < na; i++) {
			System.out.println("a["+i+"] : ");
			a[i]=scan.nextInt();
		}
		
		System.out.print("배열 b의 요솟수 : ");
		int nb = scan.nextInt(); //배열 b의 요솟수
		
		int[] b = new int[nb]; // 배열 b는 입력받은 nb개의 요솟수를 가짐
		
		for (int i = 0; i < nb; i++) {
			System.out.print("b["+i+"] : ");
			b[i] = scan.nextInt();
		}
		
		System.out.println("배열 a와 b는 "+ (equals(a,b)? "같다.":"같지 않다."));
	
	}
}
