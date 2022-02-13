package programmers;

import java.util.LinkedList;
import java.util.Queue;


//����/ť 02 ������
//1. �μ� ������� ���� �տ� �ִ� ����(J)�� ����Ͽ��� �����ϴ�.
//2. ������ �μ� ����Ͽ��� J���� �߿䵵�� ���� ������ �� ���� �����ϸ� J�� ������� ���� �������� �ֽ��ϴ�.
//3. �׷��� ������ J�� �μ��մϴ�.
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

        Queue<Waiting> que = new LinkedList<>(); //����� Queue

        // que�� priorities�� ��´�.
        for(int i=0; i<priorities.length; i++){
            que.add(new Waiting(i, priorities[i]));
        }

        while (!que.isEmpty()){

           Waiting front = que.poll();       //�μ� ����� ���� �տ� �ִ� ����
           boolean flag = false;
           
           for(Waiting w : que) {
        	   System.out.println("w p : "+ w.priority + " /  front p : " + front.priority);
        	   if(w.priority > front.priority)
        		   flag = true;
           }
           
           if(flag) { //������ �μ� ����Ͽ���  �߿䵵�� ���� ������ �� ���� �����ϸ� ������� ���� �������� �ֽ��ϴ�.
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
        
        return answer;//���� �μ⸦ ��û�� ������ �� ��°�� �μ�Ǵ��� return
      
    }


    public static void main(String[] args) {
        int [] priorities = {2, 1, 3, 2};
        int location = 2;

        StackQueue_Printer p = new StackQueue_Printer();
        System.out.println(p.solution(priorities, location));

    }
}
