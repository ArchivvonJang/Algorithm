package programmers;

//������ȹ�� - �����ﰢ��
public class Dp_Triangle02 {
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
    static int solution(int[][] triangle) {
        int answer = 0;
        //1. ���ڸ� ���� ��ų �迭�� triangle�� �迭�� ���� ũ��� ���� �ʱ�ȭ�Ѵ�.
        int [][] dp = new int[triangle.length][triangle.length];
        
        //2. ���� ������� ���� �־��ش�. 
        dp[0][0] = triangle[0][0];
        System.out.println("�� ����� �� --> " + dp[0][0]);
        //3. ���� ���ʰ� ������ ���鸸 �����ش�.
        for (int i = 1; i < triangle.length; i++) {
        	System.out.println("�� ���� ���ϱ� i ->" + i);
        	
            dp[i][0] = dp[i - 1][0] + triangle[i][0]; // ���� �� ��
            dp[i][i] = dp[i - 1][i - 1] + triangle[i][i]; // ������ �� ��
          
            System.out.println(i+" ��° �� dp[i][0] -> "+dp[i][0] + " / triangle[i][0] ->" + triangle[i][0]);
            System.out.println(i+" ��° ���� dp[i][i] -> "+ dp[i][i]+ " / triangle[i][i] ->" + triangle[i][i]);
        }
        
    	/* j|0  1  2  3  4
    	 *i ---------------
    	 *0 |7  
    	 *1 |10 15
    	 *2 |18  0 15
    	 *3 |20  0  0 19
    	 *4 |24  0  0  0 24
    	 */
        
        //4. ���� ���ʰ� �������� ������ �߰� ������ ���������� ���Ѵ�.
        for (int i = 2; i < triangle.length; i++) {
            for (int j = 1; j < i; j++) {
            	System.out.println("�߰� �� ���ϱ� i : " + i + " / j :" + j);
            	System.out.println("i : "+i +" ��° / j  = "+j+" ��° , dp[i - 1][j - 1] -> " + dp[i - 1][j - 1] );
            	System.out.println("i : "+i +" ��° / j  = "+j+" ��° , dp[i - 1][j] -> " + dp[i - 1][j]);
            	System.out.println("i : "+i +" ��° / j  = "+j+" ��° , triangle[i][j] -> " +triangle[i][j]);
            	
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
        
        //�ش� ����� �ִ밪�� == �� �Ʒ� �迭�� ����
        int maxNum = dp[dp.length - 1][0]; //�迭�� ���̴� 5�ε� �� ������ 4�ϱ�?
        System.out.println("dp.length : " + dp.length);
        //5. �ݺ����� ���鼭 �ִ밪�� �����ش�. 
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
