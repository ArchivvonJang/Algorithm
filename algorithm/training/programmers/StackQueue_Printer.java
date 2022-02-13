package programmers;

import java.util.LinkedList;
import java.util.Queue;


//스택/큐 02 프린터
//1. 인쇄 대기목록의 가장 앞에 있는 문서(J)를 대기목록에서 꺼냅니다.
//2. 나머지 인쇄 대기목록에서 J보다 중요도가 높은 문서가 한 개라도 존재하면 J를 대기목록의 가장 마지막에 넣습니다.
//3. 그렇지 않으면 J를 인쇄합니다.
public class StackQueue_Printer {
	
	class Waiting{
		int location;
		int priority;
		
		public Waiting(int location, int priority) {
			this.location = location;
			this.priority = priority;
		}
	}
	
    public int solution(int[] priorities, int location) {
        int answer = 0;

        int cnt = 0;

        Queue<Waiting> que = new LinkedList<>(); //대기목록 Queue

        // que에 priorities를 담는다.
        for(int i=0; i<priorities.length; i++){
            que.add(new Waiting(i, priorities[i]));
        }

        while (!que.isEmpty()){

           Waiting front = que.poll();       //인쇄 대기목록 가장 앞에 있는 문서
           boolean flag = false;
           
           for(Waiting w : que) {
        	   System.out.println("w p : "+ w.priority + " /  front p : " + front.priority);
        	   if(w.priority > front.priority)
        		   flag = true;
           }
           
           if(flag) { //나머지 인쇄 대기목록에서  중요도가 높은 문서가 한 개라도 존재하면 대기목록의 가장 마지막에 넣습니다.
        	   que.add(front);
           }else {
        	   cnt++;
        	   if(front.location == location) {
        		   answer = cnt;
        	   		break;
        	   }// end if
           }
 
        }
        System.out.println(answer);
        
        return answer;//내가 인쇄를 요청한 문서가 몇 번째로 인쇄되는지 return
      
    }


    public static void main(String[] args) {
        int [] priorities = {2, 1, 3, 2};
        int location = 2;

        StackQueue_Printer p = new StackQueue_Printer();
        System.out.println(p.solution(priorities, location));

    }
}
