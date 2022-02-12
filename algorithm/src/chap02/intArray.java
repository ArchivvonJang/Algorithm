package chap02;
//02-1 배열 (p.42)
public class intArray {
//자료구조 (data structure) :  데이터 단위(데이터를 구성하는 한 덩이)와 데이터 자체 사이의 물리적 또는 논리적 관계
//배열 (array) : 같은 자료형의 변수로 이루어진 구성요소(component)의 모임

// 구성요서의 자료형이 int형인 배열 (구성요소의 갯수는 5 : new에 의해 본체를 생성)
	public static void main(String[] args) {
		int[] a = new int[5]; // 배열의 선언
		/* 배열 - 같은 자료형의 변수로 이루어진 구성요소(component)의 모임
		 * int[] a = new int[5]; 변수a가 배열의 본체를 참조하도록 설정
		 */
		a[1] = 32; 
		a[2] = 43;
		a[4] = a[1]*3; 
	
	//배열의 길이만큼 반복문
		for (int i = 0; i < a.length; i++) {
			System.out.println("i="+i+", a["+i+"]="+a[i]);
		}
		
/* i=0, a[0]=0
	i=1, a[1]=32
	i=2, a[2]=43
	i=3, a[3]=0
	i=4, a[4]=96  */	
	}
	
	// 자료형에 따라 배열의 초기값(dafault value)가 다름
	/*	구성요소
	 * 	배열 변수이름[인덱스] - 배열 안의 임의의 구성요소
	 * 	배열 변수 이름.length - 배열의 구성 요소 갯수
	 */
}
