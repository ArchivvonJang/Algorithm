package programmers;
//������ȹ�� ���

//������ �б����� ���� ���� m x n ũ���� ���ڸ��
//�����ʰ� �Ʒ������θ� ������ ������ �б����� �� �� �ִ� �ִܰ���� ������ 1,000,000,007�� ���� �������� return
public class Dp_puddles {
	static int solution(int m, int n, int[][] puddles) {
	   int answer = 0;

	   ///dp[i][j] : 0,0 -> i,j�� ���� ����� ��
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
		int[][] puddles = {{1, 2},{2,1}};   // puddle[I][J] �迭����  puddle[I][0] ��(col),puddle[I][1] ��(row)
		int m = 4; 
		int n = 3;
		
		System.out.println(solution(m,n,puddles));
		
	}

}
