package programmers;

import java.util.HashSet;

//동적계획법 (Dynamic Programming) - N으로 표현
public class Dp_N01 {
	
	private int answer;
	private int origin;
	HashSet<Integer>[] set;
	
	public int solution(int N, int number) {
        answer = 0;
        origin = N; 
        set = new HashSet[9]; // 1부터 최대 8개의 N을 사용하도록 배열 크기를 지정해준다.
        
        for(int i=1; i<=8; i++) {
        	System.out.println("------------------------------------------");
        	System.out.println(">> " +i+ "  번째 getNum 실행");
        	
            getNum(i);
            
            if(set[i].contains(number)){
            	
            	System.out.println("set[i].contains(number) number "+number + ", i = " + i);
                return i;
                
            }
        }
        
        return -1; // 8개 이상, -1로 반환
	}

	public HashSet<Integer> getNum(int n){
		
		if(set[n]!=null) return set[n]; //이미 값이 있으면 그대로 반환한다.
		
		int num = 0;
		
		 // N을 이용하여 1개 일때, N, 2개일때, NN, 3개 일때, NNN 숫자를 만들어서 넣는다.
		for (int i = 0; i < n; i++) {
			
			System.out.println("origin = "+origin);
			System.out.println("num = "+num);
			
			num = 10 * num + origin;
			System.out.println("new num = " + num);
		}
		
		set[n] = new HashSet<>(); 
		set[n].add(num);
		
		//모든 경우의 수를 구한다.
		for (int i = 0; i < n; i++) {
			int j = n - i;
			
			System.out.println( "실행 횟수 : " +n +" -> i = "+i+" ,j = " + j);
			//2번째 실행하면, i=0, j=2/ i=1, j=1;
			//3번째 실행하면, i=0, j=3/ i=1, j=2/ i=2, j=1 
			if( set[i] != null || set[j] != null) 
				getNum(i); 
				getNum(j);
			
			for(int n1 : set[i]) {
				for(int n2 : set[j]) {
					//System.out.println("----- n1 = " + n1 + " / n2 = " + n2);
					set[n].add(n1+n2); 
					set[n].add(n1-n2); 
					set[n].add(n1*n2); 
					if(n2!=0) set[n].add(n1/n2); 
					
				}
			}
			
		}
		
		return set[n];
	}
	public static void main(String[] args) {
		int N = 2;
		int number = 11;
		
		Dp_N01 dp = new Dp_N01();
		
		System.out.println(dp.solution(N, number));
	}


}
