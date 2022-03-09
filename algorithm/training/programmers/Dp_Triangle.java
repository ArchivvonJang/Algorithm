package programmers;
//������ȹ�� - �����ﰢ��
public class Dp_Triangle {
	// ������ ���� ��� �� ū �� �����ؼ� ����������?
	// ���� ���ʰ� �������� ��� �״�� ��������, �߰� ������ �ڽ��� ����, ������ �� ū �� ����
	// ������ �ٿ��� ���� ū �� ����
	
	/* j|0 1 2 3 4
	 *i ------------
	 *0 |7
	 *1 |3 8
	 *2 |8 1 0
	 *3 |2 7 4 4
	 *4 |4 5 2 6 5
	 */
    public int solution(int[][] triangle) {
        int answer = 0;
        //1. ���ڸ� ���� ��ų �迭�� triangle�� �迭�� ���� ũ��� ���� �ʱ�ȭ�Ѵ�.
        int [][] dp = new int[triangle.length][triangle.length];
        
        dp[0][0] = triangle[0][0];
        for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle.length; j++) {
				// ���� ����
				if(j == 0) {
					dp[i][j] = dp[i - 1][0] + triangle[i][j];
				// ���� ������	
				}else if ( j == triangle[i].length - 1) {
					dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
				}else {
					dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
				}	
			}
		}
        
        for (int i = 0; i < triangle.length; i++) {
        	//������ �ٿ����� ���� ū �� 
			answer = Math.max(answer, dp[triangle.length -1 ][i]);
		}
        return answer;
    }
    
    public static void main(String[] args) {
        int [][] t = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
    }

}
