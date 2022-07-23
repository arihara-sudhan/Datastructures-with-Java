// Let's delete an element at end of Doubly Linked List
// Learn Datastructure in Java - Ariharasudhan


public class DoublyLinkedList_DELETE_AT_End {	
	private Node head;
	private Node tail;
	private int length;

	private static class Node {
		private int data;
		private Node next;
		private Node prev;
		public Node(int data) {
			this.data = data;
		}
	}
	
	public DoublyLinkedList_DELETE_AT_End(Node head,Node tail,int len) {
		this.head = head;
		this.tail = tail;
		this.length = len;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public int length() {
		return length;
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
		Node temp = tail;
		if(head==tail){
			head = null;
		}
		else {
			tail.prev.next = null;
		}
		tail = tail.prev;
		temp = null;
	}

	public void displayForward() {
		if(head == null)
			return;		
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public void displayBackward() {
		if(head == null)
			return;		
		Node temp = tail;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.prev;
		}
		System.out.println("null");
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
		sixth.prev = fifth;
		fifth.prev = fourth;
		fourth.prev = third;
		third.prev = second;
		second.prev = head;
		DoublyLinkedList_DELETE_AT_End dll = new DoublyLinkedList_DELETE_AT_End(head,sixth,6);
		dll.deleteLast();
		dll.displayForward();
	}
}