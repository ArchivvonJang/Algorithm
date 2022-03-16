package programmers;
//동적계획법 등굣길

//집에서 학교까지 가는 길은 m x n 크기의 격자모양
//오른쪽과 아래쪽으로만 움직여 집에서 학교까지 갈 수 있는 최단경로의 개수를 1,000,000,007로 나눈 나머지를 return
public class Dp_puddles {
	static int solution(int m, int n, int[][] puddles) {
	   int answer = 0;

	   ///dp[i][j] : 0,0 -> i,j로 가는 경우의 수
	   int [][]dp = new int[m+1][n+1];

	   for (int i = 0; i < puddles.length; i++) {
		dp[puddles[i][0]][puddles[i][1]] = -1;
	   }
	   
	   dp[1][1]=1;
	   
	   for(int i = 1; i< n+1; i++) {
		   for(int j = 1; j <m+1; j++) {
			   
			   if(dp[i][j] == -1) { 
				   dp[i][j] = 0;
			   }else {
				   if(i > 0) dp[i][j] += dp[i-1][j];
				   if(j > 0) dp[i][j] += dp[i][j-1];
			   }
		   }
	   }
		/*
		 * for(int i=1; i<=m; i++){	
		 * for(int j=1; j<=n; j++){
		 * if(dp[i][j]==-1){ dp[i][j]=0; continue; } if(i!=1)
		 * dp[i][j]+=dp[i-1][j]%1000000007; if(j!=1) dp[i][j]+=dp[i][j-1]%1000000007; }
		 * }
		 */
	   answer = (int)(dp[n][m] & 1000000007);
	   return answer;
    }
	public static void main(String[] args) {
		int[][] puddles = {{1, 2},{2,1}};   // puddle[I][J] 배열에서  puddle[I][0] 열(col),puddle[I][1] 행(row)
		int m = 4; 
		int n = 3;
		
		System.out.println(solution(m,n,puddles));
		
	}

}
