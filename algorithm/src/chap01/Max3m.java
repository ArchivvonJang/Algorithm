package chap01;

public class Max3m {
	// a,b,c 의 최대값을 구하여 반환한다.
	static int max3(int a, int b, int c) {
		int max = a;
		if(b>max) max=b;
		if(c>max) max=c;
		
		return max; // 구한 최대값을 호출한 곳으로 반환
	}
	
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3,2,1)); //1. a>b>c
		System.out.println("max3(3,2,2) = " + max3(3,2,2)); //2. a>b=c
		System.out.println("max3(3,1,2) = " + max3(3,1,2)); //3. a>c>b
		System.out.println("max3(3,2,3) = " + max3(3,2,3)); //4. a=c>b
		System.out.println("max3(2,1,3) = " + max3(2,1,3)); //5. c>a>b
		System.out.println("max3(3,3,2) = " + max3(3,3,2)); //6. a=b>c
		System.out.println("max3(3,3,3) = " + max3(3,3,3));	//7. a=b=c
		System.out.println("max3(2,2,3) = " + max3(2,2,3));	//8. c>a=b
		System.out.println("max3(2,3,1) = " + max3(2,3,1));	//9. b>a>c
		System.out.println("max3(2,3,2) = " + max3(2,3,2));	//10. b>a=c
		System.out.println("max3(1,3,2) = " + max3(1,3,2));	//11. b>c>a
		System.out.println("max3(2,3,3) = " + max3(2,3,3));	//12. b=c>a
		System.out.println("max3(1,2,3) = " + max3(1,2,3));	//13. c>b>a
		
		/*
		 [알고리즘] 
		 문제를 해결하기 위한 것 
		 명확하게 정의되고 순서가 있는 유한개의 규칙으로 이루어진 집합
		 */
		
		/*
		 * 조합을 나열한 모양은 나무형태 -> 결정트리 (decision tree)
		 * */
	}
}