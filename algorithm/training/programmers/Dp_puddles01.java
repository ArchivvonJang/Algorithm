package programmers;
//������ȹ�� ���
//��ȭ�� grid(n. m) = grid(n, m -1) + grid(n-1, m)
import java.util.Arrays;

public class Dp_puddles01 {
	private static int [][]dp;
						//���� ���� , ���� ����, ������ ��ǥ
	static int solution(int m, int n, int[][] puddles) {
		
	   ///dp[n][m] :0,0 -> i,j�� ���� ����� �� 
	   // �迭�� �ε����� 0 ����������, ���������� 1 �������� �迭[n+1][m+1] 
	   dp = new int[n+1][m+1];
	   
	   //������ ���ϱ� - �迭�� ��ġ�� ���� -1�� �ʱ�ȭ
	   Arrays.stream(puddles).forEach(v -> dp[v[1]][v[0]] = -1);
	   
	   //������� ��ǥ ����
	   dp[1][1]=1;
	   
	   return toSchool(n,m);
    }
	
	private static int toSchool(int row, int col) {
		
		System.out.println("row : " + row + ", col : " + col);
		
		System.out.println("dp[row][col] : "+dp[row][col]);
		
		if(row < 1 || col < 1 || dp[row][col] < 0) return 0;
		
		//ó���� ���� �ִٸ� �� ���� ��ȯ
		if(dp[row][col] > 0) return dp[row][col];
		
		
		
		System.out.println("toSchool(row, col-1) : " + toSchool(row, col-1));
		System.out.println("toSchool (row-1 , col) : " + toSchool (row-1 , col));
		System.out.println(toSchool(row, col-1) + toSchool (row-1 , col));
		
	
		return dp[row][col] = (toSchool(row, col-1) + toSchool (row-1 , col)) % 1000000007;
		
	}
	
	public static void main(String[] args) {
		//y,x
		int[][] puddles = {{2,2}};   // puddle[I][J] �迭����  puddle[I][0] ��(col),puddle[I][1] ��(row)
		int m = 4; 
		int n = 3;
		
		System.out.println(solution(m,n,puddles));
		
	}

}
