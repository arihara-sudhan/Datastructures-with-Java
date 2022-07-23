// Let's insert an element at beginning of Doubly Linked List
// Learn Datastructure in Java - Ariharasudhan

public class DoublyLinkedList_INSERT_AT_Beg {	
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
	
	public DoublyLinkedList_INSERT_AT_Beg(Node head,Node tail,int len) {
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
	
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		if(isEmpty())
			tail = newNode;
		else
 			head.prev = newNode;
		newNode.next = head;
		head = newNode;
		length++;
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
		DoublyLinkedList_INSERT_AT_Beg dll = new DoublyLinkedList_INSERT_AT_Beg(head,sixth,6);
		dll.insertFirst(0);
		dll.displayForward();
	}
}