package programmers;

//동적계획법 - 정수삼각형
public class Dp_Triangle02 {
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
    static int solution(int[][] triangle) {
        int answer = 0;
        //1. 숫자를 누적 시킬 배열을 triangle의 배열과 같은 크기로 값을 초기화한다.
        int [][] dp = new int[triangle.length][triangle.length];
        
        //2. 가장 꼭대기의 값을 넣어준다. 
        dp[0][0] = triangle[0][0];
        System.out.println("맨 꼭대기 값 --> " + dp[0][0]);
        //3. 가장 왼쪽과 오른쪽 값들만 더해준다.
        for (int i = 1; i < triangle.length; i++) {
        	System.out.println("왼 오른 더하기 i ->" + i);
        	
            dp[i][0] = dp[i - 1][0] + triangle[i][0]; // 왼쪽 끝 값
            dp[i][i] = dp[i - 1][i - 1] + triangle[i][i]; // 오른쪽 끝 값
          
            System.out.println(i+" 번째 왼 dp[i][0] -> "+dp[i][0] + " / triangle[i][0] ->" + triangle[i][0]);
            System.out.println(i+" 번째 오른 dp[i][i] -> "+ dp[i][i]+ " / triangle[i][i] ->" + triangle[i][i]);
        }
        
    	/* j|0  1  2  3  4
    	 *i ---------------
    	 *0 |7  
    	 *1 |10 15
    	 *2 |18  0 15
    	 *3 |20  0  0 19
    	 *4 |24  0  0  0 24
    	 */
        
        //4. 가장 왼쪽과 오른쪽을 제외한 중간 값들을 순차적으로 더한다.
        for (int i = 2; i < triangle.length; i++) {
            for (int j = 1; j < i; j++) {
            	System.out.println("중간 값 더하기 i : " + i + " / j :" + j);
            	System.out.println("i : "+i +" 번째 / j  = "+j+" 번째 , dp[i - 1][j - 1] -> " + dp[i - 1][j - 1] );
            	System.out.println("i : "+i +" 번째 / j  = "+j+" 번째 , dp[i - 1][j] -> " + dp[i - 1][j]);
            	System.out.println("i : "+i +" 번째 / j  = "+j+" 번째 , triangle[i][j] -> " +triangle[i][j]);
            	
                dp[i][j] = Math.max(dp[i - 1][j - 1], dp[i - 1][j]) 
                    + triangle[i][j];
                System.out.print(dp[i][j]+" ");
            }
        }
        
    	/* j|0  1  2  3  4
    	 *i ---------------
    	 *0 |7  
    	 *1 |10 15
    	 *2 |18 16 15
    	 *3 |20 25 20 19
    	 *4 |24 30 27 26 24
    	 */
        
        //해당 경로의 최대값들 == 맨 아래 배열의 값들
        int maxNum = dp[dp.length - 1][0]; //배열의 길이는 5인데 총 갯수는 4니까?
        System.out.println("dp.length : " + dp.length);
        //5. 반복문을 돌면서 최대값을 비교해준다. 
        for (int i = 1; i < triangle.length; i++) {
            int num = dp[dp.length - 1][i]; 
            if (maxNum < num) {
            	System.out.println(" --> maxnum : "+maxNum + " / num : " + num);
            	maxNum = num;
            }
        }
        answer = maxNum;
        return answer;
    }
    
    public static void main(String[] args) {
        int [][] t = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        
        System.out.println(solution(t));
    }

}
