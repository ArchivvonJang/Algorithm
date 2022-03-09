package programmers;import java.awt.image.AbstractMultiResolutionImage;
import java.util.Arrays;

//동적계획법 - 정수삼각형
public class Dp_Triangle01 {
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
        for (int i = 1; i < triangle.length; i++) {
            triangle[i][0] += triangle[i-1][0];
            triangle[i][i] += triangle[i-1][i-1];
            for (int j = 1; j < i; j++) 
                triangle[i][j] += Math.max(triangle[i-1][j-1], triangle[i-1][j]);
        }

        return Arrays.stream(triangle[triangle.length-1]).max().getAsInt();
    }
    
    public static void main(String[] args) {
        int [][] t = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        
        System.out.println(solution(t));
    }

}
