package chap02;

import java.util.Scanner;

//배열 역순 정렬
public class ReverseArray {
	//배열 요소에 값을 읽고 역순으로 정렬
	
	//배열 요소 a[idx1]과 [idx2]의 값을 t를 이용해 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1]; //t에 idx1값을 보관
		a[idx1] = a[idx2];  //idx1에 idx2를 대입함으로서 idx2, idx2값이 됨
		a[idx2]=t; //다시 원래 idx2에 t를 대입, idx2 idx1이 됨
	}
	
	//배열 a요소를 역순으로 정렬(for문을 사용 절반이 값이 대칭으로 교환되기때문에 반절까지만 읽으면된다)
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++){
			swap(a, i, a.length-i-1); //a, idx1, idx2(총길이에서 i번째를 빼고 1을 더한값) 
		}//for end
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 배열의 길이를 입력받는다.
		System.out.print("배열의 내부 요소 갯수: ");
		int num = scan.nextInt(); // == 배열 요소의 갯수
		
		int[] x = new int[num]; // 길이가 num-1인 배열
		
		for(int i = 0; i<num; i++) {
			//배열의 요소 갯수만큼 요소 값을 입력받는다
			System.out.print("x["+i+"] -> ");
			x[i] = scan.nextInt();
		}//for end
		
		reverse(x); //상단 reverse메소드에 배열x 대입 --> 배열 a(x)의 요소를 역순으로 졍렬
		
		System.out.println("[배열을 역순으로 정렬]");
		for (int i = 0; i < num; i++) {
			System.out.println("reverse x["+i+"] = " +x[i] );
		}
	}
}


