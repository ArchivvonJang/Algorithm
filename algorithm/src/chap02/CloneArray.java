package chap02;
// 배열의 복제(클론)
// --> 배열이름.clone() 
public class CloneArray {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = a.clone();  //b는 a의 복제를 참조
		
		b[3] = 0; // 한 요소에만 0 대입
		
		System.out.print("a = ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}//a의 배열 꺼내기
		
		System.out.print("\nb = ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(" "+b[i]);
		}//b의 배열 꺼내기
	}
}
