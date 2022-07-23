// Implementation of Circular Linked List
// Learn Datastructure in Java - Ariharasudhan

class CircularLinkedList {
	private Node last;
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	public CircularLinkedList(Node last,Node head) {
		this.last = last;
		this.last.next = head;
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		head.next = second;
		second.next = third;
		CircularLinkedList cll = new CircularLinkedList(third,head);
	}
}