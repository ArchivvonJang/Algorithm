package chap02;

import java.util.Scanner;

//Q2. 오른쪽처럼 배열요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램을 작성하세요.(p.61)
public class Q2_ReverseArrayEx_02_02 {
	
	//배열의 값 i1과 i2을 교환
	static void swap(int[] a, int i1, int i2) {
		int t = a[i1];
		a[i1] = a[i2];
		a[i2] = t;
	}
	// 기존의 배열 a 를 출력
	static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();//줄바꿈
	}
	//배열 a의 요소를 역순 정렬
	static void reverse(int[] a) {
		for(int i = 0; i<a.length/2 ;i++) {
			System.out.println("[역순 정렬 과정]");
			System.out.println("a["+i+"] 와 a["+(a.length-i-1)+"] 를 교환합니다.");
			swap(a, i, a.length-i-1);
			print(a); // 출력 메소드 여기서 부르기
		}
	}
	//배열의 요소 갯수 입력받고 출력
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소의 갯수 : ");
		int num = scan.nextInt();
		
		int[] x = new int[num]; //요소 갯수가 num인 배열 x
		
		for (int i = 0; i < num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = scan.nextInt(); //배열의 요소 값 입력받기
		}
		
		reverse(x);
		
		System.out.println("[역순으로 정렬하는 과정 END]");
		for (int i = 0; i < num; i++) {
			System.out.println("x["+i+"] = "+x[i]);
		}
	}
	
}
