package programmers;

import java.util.Collections;
import java.util.PriorityQueue;

public class StackQueue_Printer01 {
	
	//스택/큐 02 프린터 v1.1
	 public int solution(int[] priorities, int location) {
		 
	        int answer = 0;
	        // 1. 큰 수가 우선순위를 갖는 우선순위 큐
	        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
	        
	        // 2. priorities값을 우선순위 큐에 담는다.
	        for(int n : priorities){
	            que.offer(n);
	        }
	        
	        // 3. 모든 대기목록이 비워질 때 까지(큐가 비어질 때) 반복한다.
	        while(!que.isEmpty()){
	            // 4. 큐에서 나오는 값과 값이 같은 경우를 탐색한다.
	            for(int i = 0; i<priorities.length; i++){
	            	
	                // 5. 값만 일치하는 경우 해당 문서 출력.
	                if(que.peek() == priorities[i] ){
	                	
	                    que.poll();
	                    answer++;
	                    
	                    // 6. 값과 위치가 모두 일치하면 answer을 반환한다.
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
