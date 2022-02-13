package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class StackQueue_Printer01 {
	
	//����/ť 02 ������ v1.1
	 public int solution(int[] priorities, int location) {
		 
	        int answer = 0;
	        // 1. ū ���� �켱������ ���� �켱���� ť
	        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
	        
	        // 2. priorities���� �켱���� ť�� ��´�.
	        for(int n : priorities){
	            que.offer(n);
	        }
	        
	        // 3. ��� ������� ����� �� ����(ť�� ����� ��) �ݺ��Ѵ�.
	        while(!que.isEmpty()){
	            // 4. ť���� ������ ���� ���� ���� ��츦 Ž���Ѵ�.
	            for(int i = 0; i<priorities.length; i++){
	            	
	                // 5. ���� ��ġ�ϴ� ��� �ش� ���� ���.
	                if(que.peek() == priorities[i] ){
	                	
	                    que.poll();
	                    answer++;
	                    
	                    // 6. ���� ��ġ�� ��� ��ġ�ϸ� answer�� ��ȯ�Ѵ�.
	                    if(location == i ) 
	                    	return answer;
	                }
	            }
	            
	        }
	                
	        return answer;
	    }
    public static void main(String[] args) {
        int [] priorities = {2, 1, 3, 2};
        int location = 2;

        StackQueue_Printer01 p01 = new StackQueue_Printer01();
        System.out.println(p01.solution(priorities, location));

    }
}
