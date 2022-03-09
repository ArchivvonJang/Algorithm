package programmers;

//동적계획법 (Dynamic Programming) - N으로 표현
public class Dp_N {
	
	private int answer;
	
	public int solution(int N, int number) {
		answer = -1;
		
		dfs(N, number, 0,0);
	  
	  return answer == Integer.MAX_VALUE ? -1 : answer;
	}
	
	private void dfs(int n, int num, int result, int cnt) {
		if(cnt > 8) return;
		
		if(num == result) {
			if(cnt < answer || answer == -1) answer = cnt;
		}
	
		 // 재귀함수 N, NN, NNN, ... 에 대해 사칙연산 추가 
		int nn = 0;
		int newcnt = 0;
		
		for(int i = 0; i < ( 9 - cnt ); i++) {
			
			newcnt =  cnt + i ;
			
			dfs(n, num, result + nn ,newcnt);
			dfs(n, num, result - nn, newcnt);
			dfs(n, num, result * nn, newcnt);
			dfs(n, num, result / nn, newcnt);
			
			nn = nn * 10 + n;
		}
		
	}
	public static void main(String[] args) {
		
	}


}
