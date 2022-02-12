package chap02;

import java.util.Iterator;
import java.util.Scanner;

//Q3 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.(p.61)
public class Q3_ {
	static int sumOf(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return (sum);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소 갯수 : ");
		int num = scan.nextInt();
		
		int[] a = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("a["+i+"]");
			a[i] = scan.nextInt();
		}
		
		System.out.println("전체 합계는 "+sumOf(a)+"입니다.");
	}
}
