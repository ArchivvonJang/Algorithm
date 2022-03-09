package programmers;import java.awt.image.AbstractMultiResolutionImage;
import java.util.Arrays;

//������ȹ�� - �����ﰢ��
public class Dp_Triangle01 {
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
