package programmers;

import java.util.Arrays;
import java.util.PriorityQueue;

//�� ��ũ��Ʈ�ѷ�
public class Heap_DiskController {
    // ��� ť�� ��� �۾��� �ְ� ��û�ð� ���������� ����
    // ����ð��� ª�� �۾����� ó�� SJF(Shortest Job First)

    public int solution(int[][] jobs) {

        int idx = 0; // jobs �迭�� index
        int endTime = 0; // �۾� ���� �ð�
        int workTime = 0;//�۾��� ��û���� ������� �ɸ� �ð�


        // jobs�� [0][]�ڸ��� ������������ �����Ѵ�. -> �۾��� ��û�Ǵ� ����(��û�ð�)�� ���� ������ ����
        Arrays .sort(jobs, (job1, job2) -> job1[0] - job2[0]);
        	
        for (int i = 0; i < jobs.length; i++) {
			System.out.println("jobs[" + i + "] : " + Arrays.toString(jobs[i]) );
		}
        System.out.println("------------------------------");
        //�켱���� ť�� int �迭�� ���� ��, [][1] �ڸ��� ������������ �����Ѵ�. -> �۾� �ҿ�ð��� ª���������� ����
        PriorityQueue<int[]> que = new PriorityQueue<>((job1, job2) -> job1[1] - job2[1]);
   
        //��û�� ��� ����� ������ �ݺ�
        while(idx < jobs.length || !que.isEmpty()){

            // �ϳ��� �۾��� �Ϸ�Ǵ� ����(��û�ð��� ����ð����� �۰ų� ���� ��û����)���� ���� ��� ��û�� ť�� ��´�.
            while(idx < jobs.length && jobs[idx][0] <= endTime){
                que.offer(jobs[idx++]);
                
                System.out.println("1. �ϳ��� �۾��� �Ϸ�Ǵ� ����  jobs ��  idx : "+idx);
            }

            //ť�� ����ִٸ�(����������� ó���� �� �ִ� ��û�̾��ٸ�) �۾� �Ϸ� �ð� ���Ŀ� �ٽ� ��û�� ���´�. -> time ��û�� ���� ó������ �������ش�.
            if(que.isEmpty()) {
                //�۾� ��û������ ���� ���� �۾��� �߰��Ѵ�.
                endTime = jobs[idx][0];
                System.out.println("2. ť�� ����ִٸ�, endTime : "+endTime + " / idx :" + idx );
                System.out.println("------------------------------");
            //�۾��� ������ �� (time ��) ť�� �۾��� �ִٸ�, ���� �۾� ��û �� ���� ����ð��� ª�� ��û���� ��������.
            }else{
                //�۾��ҿ������ ���� ���� �۾� ����
                int[] job = que.poll();
                
                for (int i = 0; i < job.length; i++) {
					System.out.println("3. �۾��ҿ������ ���� ���� �۾� ���� job["+i+"] : " +job[i]);
				}
                System.out.println("------------------------------");
                System.out.println("4. beforem endtime : " +endTime);
                //�۾��� �ϳ� ��ģ �� ����ð� ����
                endTime += job[1];
                System.out.println("5. �۾��� �ϳ� ��ģ �� ����ð� ���� endtime : " +endTime);
                // ��û�ð����� ����ð����� , �� �۾��ð� = �۾��� �ɸ� �ð� + (����ð� - ��û�ð�)
                workTime += endTime - job[0];
                System.out.println("6. ��û�ð����� ����ð����� workTime : "+workTime + " / job[0] : " + job[0]);
            }


        }

        return (int)Math.floor(workTime / jobs.length);
    }
    
	public static void main(String[] args) {
	    //[�۾��� ��û�Ǵ� ����, �۾��� �ҿ�ð�]
        int[][] job = {{0, 3},{1, 9},{2, 6}};

        Heap_DiskController heap = new Heap_DiskController();
        
        System.out.println("��� ==" + heap.solution(job));
	}

}
