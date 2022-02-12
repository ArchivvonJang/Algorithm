package chap04;
//실습 4-3(A)
public class Queue_IntQueue {
	
	private int max; // 큐의 용량 : 큐에 저장할 수 있는 최대 요소의 개수 
	private int front; // 첫번째 요소 커서
	private int rear; // 마지막 요소 커서
	private int num; // 현재 데이터 수 
	private int [] que; //큐 본체
	
	//실행 시 예외 - 큐가 비어있음
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	
	//실행 시 예외 - 큐가 가득참
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	//생성자 - 큐 본체용 배열을 생성하는 등의 준비를 수행한다. 
	// 생성시 큐는 비어있기 때문에 num, front, rear = 0; 
	public Queue_IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];  //큐 본체용 배열을 생성
		}catch(OutOfMemoryError e) { //생성할 수 없음 
			max = 0;
		}
	}
	
	// 큐에 데이터를 인큐하는 메서드
	public int enque(int x) throws OverflowIntQueueException{
		
		if(num >= max) // 큐가 가득차서 인큐할 수 없으면 
			throw new OverflowIntQueueException(); //큐가 가득참
		
		que[rear++]  = max; 
		num ++;
		
		if(rear == max)//큐의 용량이 max와 같아지면 배열의 청ㅁ으니 0으로 변경해야한다.
			rear = 0; // 이렇게 하면 다음에 인큐할 데이터가 제대로 que[0]의 위치에 저장된다. 

		return x; //인큐에 성공하면 인큐한 값을 그대로 반환한다. 
	}
	
	//큐에서 데이터를 디큐하고 값을 반환하는 메서드
	public int deque() throws EmptyIntQueueException{
		
		if(num <= 0) //큐가 비어있어 디큐할 수 없으면
			throw new EmptyIntQueueException(); //큐가 비어있음
		
		int x = que[front++]; // 저장한 값을 꺼내고 front값을 1만큼 증가한다음
		num --; // num 값을 1만큼 감소한다.
		
		if(front == max) //1만큼 증가한 front값이 큐의 용량 max와 같아지면 front 값을 배열의 처음인 0으로 변경
			front = 0; // 이렇게 하면 다음에 디큐를 수행하더라도 제대로 que[0]의 위치에서 데이터를 꺼낼 수 있기 때문이다.
		
		return x;
	}
	
	//큐에서 데이터를 피크 (프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntQueueException{
		
		if(num<=0)
			throw new EmptyIntQueueException(); //큐가 비어있음
		return que[front];
	}
	
	//큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
	public static void main(String[] args) {
		

	}
	
	//큐를 비움
	
	
	// 큐의 용량을 반환
	
	
	// 큐에 쌓여있는 데이터 수를 반환
	
	
	// 큐가 비어있나요?
	
	
	// 큐 안의 모든 데이터를 프런ㅌ -> 리어 순으로 출력

}
