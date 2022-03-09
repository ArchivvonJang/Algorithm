package programmers;
//동적계획법 - 정수삼각형
public class Dp_Triangle {
	// 오른쪽 왼쪽 계산 후 큰 값 선택해서 내려보내기?
	// 가장 왼쪽과 오른쪽은 계산 그대로 내려오고, 중간 값들은 자신의 왼쪽, 오른쪽 중 큰 값 선택
	// 마지막 줄에서 가장 큰 수 선택
	
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
        //1. 숫자를 누적 시킬 배열을 triangle의 배열과 같은 크기로 값을 초기화한다.
        int [][] dp = new int[triangle.length][triangle.length];
        
        dp[0][0] = triangle[0][0];
        for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle.length; j++) {
				// 가장 왼쪽
				if(j == 0) {
					dp[i][j] = dp[i - 1][0] + triangle[i][j];
				// 가장 오른쪽	
				}else if ( j == triangle[i].length - 1) {
					dp[i][j] = dp[i - 1][j - 1] + triangle[i][j];
				}else {
					dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) + triangle[i][j];
				}	
			}
		}
        
        for (int i = 0; i < triangle.length; i++) {
        	//마지막 줄에가서 가장 큰 수 
			answer = Math.max(answer, dp[triangle.length -1 ][i]);
		}
        return answer;
    }
    
    public static void main(String[] args) {
        int [][] t = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
    }

}
