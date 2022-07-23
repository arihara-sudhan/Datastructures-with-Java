// Let's delete first element of Circular Linked List
// Learn Datastructure in Java - Ariharasudhan

class CircularLinkedList_DELETE_FIRST {
	private Node last;
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public CircularLinkedList_DELETE_FIRST(Node last,Node head) {
		this.last = last;
		this.last.next = head;
	}
	public void delFirst() {
		if(last==null)
			return;
		if(last==last.next){
			last = null;
			return;
		}
		Node temp = last.next;
		last.next = last.next.next;
		temp = null;
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
		CircularLinkedList_DELETE_FIRST cll = new CircularLinkedList_DELETE_FIRST(third,head);
		cll.delFirst();
		cll.print();
	}
}