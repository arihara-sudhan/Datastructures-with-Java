// Inserting a new node at the end of the Singly Linked List
// Learn Datastructure in Java - Ariharasudhan

class SinglyLinkedList_INSERT_AT_End {
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void insertAtEnd(Node New,Node head)	{
		Node cur = head;
		while(cur.next!=null)
			cur = cur.next;
		cur.next = New;
		cur = head;
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
		Node last = new Node(4);
		SinglyLinkedList_INSERT_AT_End sll = new SinglyLinkedList_INSERT_AT_End();
		sll.insertAtEnd(last,head); }
	}