package programmers;

import java.util.HashSet;

//������ȹ�� (Dynamic Programming) - N���� ǥ��
public class Dp_N01 {
	
	private int answer;
	private int origin;
	HashSet<Integer>[] set;
	
	public int solution(int N, int number) {
        answer = 0;
        origin = N; 
        set = new HashSet[9]; // 1���� �ִ� 8���� N�� ����ϵ��� �迭 ũ�⸦ �������ش�.
        
        for(int i=1; i<=8; i++) {
        	System.out.println("------------------------------------------");
        	System.out.println(">> " +i+ "  ��° getNum ����");
        	
            getNum(i);
            
            if(set[i].contains(number)){
            	
            	System.out.println("set[i].contains(number) number "+number + ", i = " + i);
                return i;
                
            }
        }
        
        return -1; // 8�� �̻�, -1�� ��ȯ
	}

	public HashSet<Integer> getNum(int n){
		
		if(set[n]!=null) return set[n]; //�̹� ���� ������ �״�� ��ȯ�Ѵ�.
		
		int num = 0;
		
		 // N�� �̿��Ͽ� 1�� �϶�, N, 2���϶�, NN, 3�� �϶�, NNN ���ڸ� ���� �ִ´�.
		for (int i = 0; i < n; i++) {
			
			System.out.println("origin = "+origin);
			System.out.println("num = "+num);
			
			num = 10 * num + origin;
			System.out.println("new num = " + num);
		}
		
		set[n] = new HashSet<>(); 
		set[n].add(num);
		
		//��� ����� ���� ���Ѵ�.
		for (int i = 0; i < n; i++) {
			int j = n - i;
			
			System.out.println( "���� Ƚ�� : " +n +" -> i = "+i+" ,j = " + j);
			//2��° �����ϸ�, i=0, j=2/ i=1, j=1;
			//3��° �����ϸ�, i=0, j=3/ i=1, j=2/ i=2, j=1 
			if( set[i] != null || set[j] != null) 
				getNum(i); 
				getNum(j);
			
			for(int n1 : set[i]) {
				for(int n2 : set[j]) {
					//System.out.println("----- n1 = " + n1 + " / n2 = " + n2);
					set[n].add(n1+n2); 
					set[n].add(n1-n2); 
					set[n].add(n1*n2); 
					if(n2!=0) set[n].add(n1/n2); 
					
				}
			}
			
		}
		
		return set[n];
	}
	public static void main(String[] args) {
		int N = 2;
		int number = 11;
		
		Dp_N01 dp = new Dp_N01();
		
		System.out.println(dp.solution(N, number));
	}


}
