package programmers;

import java.util.*;

//������ȹ�� (Dynamic Programming) - N���� ǥ��
public class Dp_N02 {
	
    static int tempN;
    static List<Integer>[] dp;//�޸������̼�


    public int solution(int N, int number) {

        tempN = N;
        int answer = -1;

        dp = new ArrayList[8];
        dp[0] = new ArrayList<>();
        dp[0].add(0);

        for(int n = 1 ; n <= 8 ; n++) {
            dp(n);
            if (dp[n].contains(number)) {
                answer = n;
                break;
            }
        }

        return answer;
    }
    
    public static List<Integer> dp(int n){
    	
        if(dp[n] != null) return dp[n];

        dp[n] = new ArrayList<>();
        dp[n].add(dp[n-1].get(0) * 10 + tempN);

        //��� ����� ���� ���Ѵ�. 
        for(int i = 1 ; i < n ; i++) {
            int j = n - i;
            List<Integer> dp1 = dp(i);
            List<Integer> dp2 = dp(j);

            for(int n1 : dp1) {
                for(int n2 : dp2) {
                    dp[n].add(n1 + n2);
                    dp[n].add(n1 - n2);
                    dp[n].add(n1 * n2);
                    if(n2 != 0) dp[n].add(n1 / n2);
                }
            }
        }
        return dp[n];
    }

	public static void main(String[] args) {
		
	}


}
