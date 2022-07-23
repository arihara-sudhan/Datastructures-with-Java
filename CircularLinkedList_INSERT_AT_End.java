// Let's insert an element at end of Circular Linked List
// Learn Datastructure in Java - Ariharasudhan

class CircularLinkedList_INSERT_AT_End {
	private Node last;
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public CircularLinkedList_INSERT_AT_End(Node last,Node head) {
		this.last = last;
		this.last.next = head;
	}
	public void insertEnd(Node newNode) {
		if(last==null) {
			last = newNode;
			last.next = last;
		}
		else {
			newNode.next = last.next;
			last.next = newNode;
			last  = newNode;
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
		CircularLinkedList_INSERT_AT_End cll = new CircularLinkedList_INSERT_AT_End(third,head);
		cll.insertEnd(new Node(4));
		cll.print();
	}
}