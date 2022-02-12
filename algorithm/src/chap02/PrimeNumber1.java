package chap02;
//소수의 나열
// 어떤 정수 이하의 소수를 모두 나열하는 알고리즘
// 2부터 n-1까지의 어떤 정수로도 나누어 떨어지지 않습니다. 
public class PrimeNumber1 {
	//p.72
	// 1000이하의 소수를 열거 (ver.1)
	public static void main(String args) {
		int counter=0; //나눗셈 횟수
		
		for(int n = 2; n<=1000; n++) {
			int i ;
			for(i=2; i<n; i++) {
				counter++;
				if(n%i==0) // 나누어떨어지면 소수가 아님
					break;//더이상 반복은 불필요
			}
			if(n==i) //마지막까지 나누어떨어지지 않음
				System.out.println(n);
		}
		
		System.out.println("나눗셈을 수행할 횟수 :" + counter);
	}
	
}
