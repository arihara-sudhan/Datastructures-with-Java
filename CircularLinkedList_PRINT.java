// Let's print elements of Circular Linked List
// Learn Datastructure in Java - Ariharasudhan

class CircularLinkedList_PRINT {
	private Node last;
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public CircularLinkedList_PRINT(Node last,Node head) {
		this.last = last;
		this.last.next = head;
	}
	public void print(Node last) {
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
		CircularLinkedList_PRINT cll = new CircularLinkedList_PRINT(third,head);
		cll.print(third);
	}
}