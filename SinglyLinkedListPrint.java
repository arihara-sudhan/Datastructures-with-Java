// Printing the elements of Singly Linked List
// Learn Datastructure in Java - Ariharasudhan

class SinglyLinkedListPrint {
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void display(Node curr)	{
		while(curr!=null) {
			System.out.println(curr.data);
			curr = curr.next; }
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		head.next = second;
		second.next = third;
		SinglyLinkedListPrint sll = new SinglyLinkedListPrint();
		sll.display(head); }
	}