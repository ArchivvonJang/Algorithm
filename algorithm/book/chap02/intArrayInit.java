package chap02;
//p.46

public class intArrayInit {
	//배열 초기화(array initializer) : 배열 본체의 생성과 동시에 각 요소의 초기화
	
	// 구성 자료형이 int형인 배열 (구성 요소 갯수 5 : 배열 초기자에 의해 생성)
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5}; //배열의 초기자에 의해 생성
		
		for(int i=0; i<a.length; i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
	}
}
