package chap02;

import java.util.Scanner;

public class MaxOfArray {
	// traverse (주사) : 배열의 요소를 하나씩 차례로 살펴보는 과정
	// 배열요소의 최대값을 구하는 메서드
	
	static int maxOf(int[] a){
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max) max=a[i];
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("사람들의 키 최대값을 구합니다.");
		
		System.out.print("사람 수(배열의 크기)-->");
		int num=scan.nextInt(); //배열의 요소 갯수를 입력받음
		
		// 배열 생성, 배열의 요소는 num
		int[] height = new int[num];
		
		for (int i = 0; i < num; i++) {
			System.out.print("height["+i+"] (각 배열의 값)---> ");
			height[i] = scan.nextInt(); //배열의 요소 값
		}
		System.out.println("최대값은 "+maxOf(height));
	}
	
	//접근제한자 : 객체의 멤버에 대한 접근을 제한
	/* public : 모든 접근 허용 (클래스, 생성자, 멤버변수, 메서드)
	 * protected : 같은 패키지(폴더)의 객체, 상속관계의 객체 허용(생성자, 멤버변수, 메서드)
	 * default : 같은 패키지(폴더)의 객체 허용 (클래스, 생성자, 멤버변수, 메서드)
	 * private : 현재 객체안에서만 허용 (생성자, 멤버변수, 메서드)
	 * 지역변수는 접근제한자를 사용할 수 없음
	 * */
}
