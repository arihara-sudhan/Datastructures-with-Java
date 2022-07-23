class Queue {
	Node rear,front;
	private class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		} 
	}
	Queue() {
		this.rear = null;
		this.front = null;
	}

	public void EnQueue(int data) {
		Node newNode = new Node(data);
		if(front==null)
			front = newNode;
		else
			rear = rear.next;
		rear = newNode;
		System.out.printf("Enqueued: %d\n",rear.data);
	}

	public void DeQueue() {
		if(front!=null){
			System.out.printf("Dequeued: %d\n",front.data);
			front = front.next;
			if(front==null){
				System.out.println("UnderFlow!");
				rear = null;
			}
		}
	}

	public static void main(String[] args){
		Queue q = new Queue();
		q.EnQueue(12);
		q.EnQueue(32);
		q.DeQueue();
		q.DeQueue();
		q.DeQueue();
	}
}