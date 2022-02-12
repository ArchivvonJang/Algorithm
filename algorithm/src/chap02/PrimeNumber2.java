package chap02;

public class PrimeNumber2 {
//p.75
	//3이 소수인지 판단하는 과정 n=3
	//안쪽 for문은 실행되지 않고 if문에 의해 n값이 prime[1]에 저장됩니다.
	public static void main(String[] args) {
		int counter = 0; //나눗셈 횟수
		int ptr = 0; //찾은 소수의 개수
		int[] prime = new int[500]; //소수를 저장하는 배열
		
		prime[ptr++] = 2; //2는 소수 
		
		//대상은 홀수만
		for(int n=3; n<=1000; n+=2) {
			int i;
			for (i = 1; i < ptr; i++) { //이미 찾은 소수 ptr로 나누기 
				counter++;
				if(n % prime[i]==0) // 나누어떨어지면 소수가 아님
					break; //소수가 아니라면 반복 멈추기
			}//for i end
			if(ptr == i) { //마지막까지 나누어떨어지지 않음
				prime[ptr++]=n; //나머지가 존재하는 나누려던 n은 소수이므로 배열에 저장  <-- ptr의 값은 1, for문의 제어식 i<ptr 즉, (1<1)이 성립하지 않으므로 for문을 수행하지 않는다. 여기에 if에서 제어식 ptr==i 즉, (1==1)는 참이므로 prime[ptr++]에 n을 대입
			}//if ptr end
		} // for end
		for(int i = 0; i < ptr; i++) {
			System.out.println(prime[i]); //찾은 ptr개의 소수를 찍기
		} // for end
			
		System.out.println("나눗셈을 수행한 횟수 : " + counter);	
			
	
	}
}
