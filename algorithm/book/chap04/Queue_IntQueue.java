package chap04;
//�ǽ� 4-3(A)
public class Queue_IntQueue {
	
	private int max; // ť�� �뷮 : ť�� ������ �� �ִ� �ִ� ����� ���� 
	private int front; // ù��° ��� Ŀ��
	private int rear; // ������ ��� Ŀ��
	private int num; // ���� ������ �� 
	private int [] que; //ť ��ü
	
	//���� �� ���� - ť�� �������
	public class EmptyIntQueueException extends RuntimeException{
		public EmptyIntQueueException() {}
	}
	
	//���� �� ���� - ť�� ������
	public class OverflowIntQueueException extends RuntimeException{
		public OverflowIntQueueException() {}
	}
	
	//������ - ť ��ü�� �迭�� �����ϴ� ���� �غ� �����Ѵ�. 
	// ������ ť�� ����ֱ� ������ num, front, rear = 0; 
	public Queue_IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max];  //ť ��ü�� �迭�� ����
		}catch(OutOfMemoryError e) { //������ �� ���� 
			max = 0;
		}
	}
	
	// ť�� �����͸� ��ť�ϴ� �޼���
	public int enque(int x) throws OverflowIntQueueException{
		
		if(num >= max) // ť�� �������� ��ť�� �� ������ 
			throw new OverflowIntQueueException(); //ť�� ������
		
		que[rear++]  = max; 
		num ++;
		
		if(rear == max)//ť�� �뷮�� max�� �������� �迭�� û������ 0���� �����ؾ��Ѵ�.
			rear = 0; // �̷��� �ϸ� ������ ��ť�� �����Ͱ� ����� que[0]�� ��ġ�� ����ȴ�. 

		return x; //��ť�� �����ϸ� ��ť�� ���� �״�� ��ȯ�Ѵ�. 
	}
	
	//ť���� �����͸� ��ť�ϰ� ���� ��ȯ�ϴ� �޼���
	public int deque() throws EmptyIntQueueException{
		
		if(num <= 0) //ť�� ����־� ��ť�� �� ������
			throw new EmptyIntQueueException(); //ť�� �������
		
		int x = que[front++]; // ������ ���� ������ front���� 1��ŭ �����Ѵ���
		num --; // num ���� 1��ŭ �����Ѵ�.
		
		if(front == max) //1��ŭ ������ front���� ť�� �뷮 max�� �������� front ���� �迭�� ó���� 0���� ����
			front = 0; // �̷��� �ϸ� ������ ��ť�� �����ϴ��� ����� que[0]�� ��ġ���� �����͸� ���� �� �ֱ� �����̴�.
		
		return x;
	}
	
	//ť���� �����͸� ��ũ (����Ʈ �����͸� �鿩�ٺ�)
	public int peek() throws EmptyIntQueueException{
		
		if(num<=0)
			throw new EmptyIntQueueException(); //ť�� �������
		return que[front];
		
		// �� ���� �����͸� ���� ������ �޼���
		// que[front] �� ���� ���縸 �ϰ� �����ʹ� �����������Ƿ� front, rear, num�� ���� �״�� 
		// ť�� ��������� ���ܸ� ������. 
	}
	
	//ť���� x�� �˻��Ͽ� �ε���(ã�� ���ϸ� -1)�� ��ȯ
	public int indexOf(int x) {
		
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if(que[idx] == x)
				return idx;
		
		}
		return -1;
		//ť�� �迭 x�� ���� �����Ͱ� ����Ǿ� �ִ� ��ġ�� �˾Ƴ��� �޼���
		// ��ĵ�� ������ front (ť�� ù��� )
		// ��ĵ�� �� index ����� (i + front) % max 
		// �˻� ������ ã�� ����� �ε��� ��ȯ
		// �˻� ���н� -1 ��ȯ

	}

	
	//ť�� ���
	public void clear() {
		
		num= front = rear = 0;
		//��� �����͸� �����ϴ� �޼���
	}

	
	// ť�� �뷮�� ��ȯ
	public int capacity() {
		 return max;
		//ť�� �ִ� �뷮�� ��ȯ�ϴ� �޼��� (max)
	}
	
	// ť�� �׿��ִ� ������ ���� ��ȯ
	public int size(){
		return num;
		//���� ť�� ������ ���� ��ȯ�ϴ� �޼��� (num)
	}

	
	// ť�� ����ֳ���?
	public boolean isEmpty() {
		return num <=0;
		// ť�� ����ִ��� �Ǵ��ϴ� �޼��� 
		// ��������� true, �ƴϸ� false ��ȯ
	}

	// ť�� ���� á����?
	public boolean isFull() {
		return num >= max; 
		// ť�� ���� á���� �Ǵ��ϴ� �޼���
		// ���� á���� true, �ƴϸ� false
	}
	
	// ť ���� ��� �����͸� ����Ʈ -> ���� ������ ���
	public void dump() {
		//ť�� ��ť�� ��� (num��) �����͸� ����Ʈ���� ���� ������ ����ϴ� �޼���
		//ť�� ��������� ť�� ������ϴٶ�� �޽��� ǥ�� 
		if(num <= 0 ) {
			System.out.println("ť�� ������ϴ�.");
			
		}else {
			for (int i = 0; i < num; i++) {
				System.out.print(que[(i+front)%max] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

	}
}
