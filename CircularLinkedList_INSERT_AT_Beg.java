// Let's insert an element at beginning of Circular Linked List
// Learn Datastructure in Java - Ariharasudhan

class CircularLinkedList_INSERT_AT_Beg {
	private Node last;
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public CircularLinkedList_INSERT_AT_Beg(Node last,Node head) {
		this.last = last;
		this.last.next = head;
	}
	public void insertFirst(Node newNode) {
		if(last==null){
			last = newNode;
			last.next = last;
		}
		else {
			newNode.next = last.next;
			last.next = newNode;
		} 
	}
	public void print() {
		Node temp = last.next;
		do {
			System.out.println(temp.data);
			temp = temp.next;
		}while(temp!=last.next);
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		head.next = second;
		second.next = third;
		CircularLinkedList_INSERT_AT_Beg cll = new CircularLinkedList_INSERT_AT_Beg(third,head);
		cll.insertFirst(new Node(0));
		cll.print();
	}
}