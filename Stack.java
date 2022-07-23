// Let's implement Stack Datastructure 
// Learn Datastructure in Java - Ariharasudhan

class Stack {
	Node top;
	int length;
	private class Node {
		int data;
		Node next;
		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	Stack() {
		top = null;
		length = 0;
	}
	public boolean isEmpty(){
		return top==null;
	}
	public int length() {
		return length;
	}

	public void push(int data) {
		Node temp = new Node(data);
		temp.next = top;
		top = temp;
		length++;
		System.out.printf("%d is Pushed!\n",data);
	}

	public void pop() {
		if(isEmpty()){
			System.out.println("UnderFlow");
			return;
		}
		System.out.printf("%d is Popped!\n",top.data);
		top = top.next;
		length--;
	}
	public static void main(String[] args) {
		Stack stk = new Stack();
		stk.push(2);
		stk.push(200000);
		stk.push(200);
		stk.pop();
		stk.pop();
	}
}