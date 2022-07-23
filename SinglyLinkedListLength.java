// Finding the length of the Singly Linked List
// Learn Datastructure in Java - Ariharasudhan

class SinglyLinkedListLength {
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	int length(Node curr)	{
		int c=0;
		while(curr!=null) {
			c++;
			curr = curr.next; }
		return c;
	}
	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		head.next = second;
		second.next = third;
		SinglyLinkedListLength sll = new SinglyLinkedListLength();
		System.out.println("Length is "+sll.length(head)); }
	}