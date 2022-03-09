package programmers;

import java.util.LinkedList;
import java.util.Queue;

//스택/큐 - 다리를 지나는 트럭
public class StackQueue_truck {

					// 다리를 올라가는 트럭 수 , 다리가 견딜 수 있는 무게, 트럭별 무게
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> que = new LinkedList<Integer>();
        
        // que에 트럭을 담는다
        
        // 큐 값과 무게를 비교
        // 무게 > 트럭
        // 하나씩 꺼내면서 
        // 무게 < 트럭
        
        return answer; // 모든 트럭이 다리를 건너는데 걸리는 최소 시간(초)
    }
    
    
	public static void main(String[] args) {
		int bridge_length = 100;
		int weight = 100;
		int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};

	}

}
