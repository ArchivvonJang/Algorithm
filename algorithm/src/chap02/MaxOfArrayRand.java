package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {
	//난수를 사용해 배열의 요솟값 설정하기 : 각 요소에 난수 대입 (p.55)
	
	static int maxOf(int[] a) {
		int max= a[0];
		for (int i = 1; i < a.length; i++) 
			if(a[i]>max) 
				max=a[i];
			
		return max;
	}
	public static void main(String[] args) {
		Random ran = new Random(); //난수
		Scanner scan = new Scanner(System.in); //입력받기
		
		System.out.println("[키의 최대값을 난수와 배열을 이용해 구합니다.]");
		System.out.print("사람 수 : "); //배열의 크기
		int num = scan.nextInt();
		int[] height = new int[num]; // 요소 갯수가 num인 배열 생성
		
		System.out.println("[각 사람의 키의 값]");
		for (int i = 0; i < num; i++) { //num = height.length
			height[i] = 100 + ran.nextInt(90); // 90개(0 ~ 89)의 랜덤값을 가져옴
			System.out.println((i+1)+ "번째 사람 => height["+i+"] : "+height[i]);
			
		}
	}
}
