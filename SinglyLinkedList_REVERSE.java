// Reversing the Singly Linked List
// Learn Datastructure in Java - Ariharasudhan
	
class SinglyLinkedList_REVERSE {
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void reverse(Node head) {
		Node cur = head;
		Node next = null;
		Node prev = null;
		while(cur!=null) {
			next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		cur = prev;
		while(cur!=null) {
			System.out.printf("%d->",cur.data);
			cur = cur.next;
		}
		System.out.printf("null");
	}
	

	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		head.next = second;
		second.next = third;
		SinglyLinkedList_REVERSE sll = new SinglyLinkedList_REVERSE();
		sll.reverse(head);
	}
}
