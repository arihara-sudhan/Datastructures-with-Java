// Inserting a new node at the beginning of the Singly Linked List
// Learn Datastructure in Java - Ariharasudhan

class SinglyLinkedList_INSERT_AT_Beg {
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void insertAtBeg(Node New,Node head)	{
		New.next = head;
		head = New;
		Node cur = head;
		while(cur!=null) {
			System.out.println(cur.data);
			cur = cur.next;
		}
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		head.next = second;
		second.next = third;
		Node first = new Node(0);
		SinglyLinkedList_INSERT_AT_Beg sll = new SinglyLinkedList_INSERT_AT_Beg();
		sll.insertAtBeg(first,head); }
	}