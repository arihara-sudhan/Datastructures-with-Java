// Let's implement Doubly Linked List
// Learn Datastructure in Java - Ariharasudhan
	
class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int len;
	private static class Node {
		private int data;
		private Node next;
		private Node previous;
		public Node(int data) {
			this.data = data;
			this.previous = null;
			this.next = null;
		}
	}
	public DoublyLinkedList(Node head,Node tail,int length) {
		this.head = head;
		this.tail = tail;
		this.len = length;
	}
	boolean isEmpty() {
		return this.len==0;
	} 
	int length() {
		return this.len;
	} 
	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		DoublyLinkedList dll = new DoublyLinkedList(head,sixth,6);
	}
}
