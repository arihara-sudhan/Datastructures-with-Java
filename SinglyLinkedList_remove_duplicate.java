// Removing duplicate elements in a sorted linked list
// Learn Datastructure in Java - Ariharasudhan
	
class SinglyLinkedList_remove_duplicate {
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void remdup(Node head) {
		Node cur = head;
		while(cur!=null && cur.next!=null) {
			if(cur.data==cur.next.data){
				cur.next = cur.next.next; }
			else {
				cur = cur.next;
			}
		}
		cur = head;
		while(cur!=null){
			System.out.printf("%d->",cur.data);
			cur = cur.next;
		}
		System.out.print("null");
	}
	

	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(2);
		Node fourth = new Node(4);
		Node fifth = new Node(4);
		Node sixth = new Node(5);
		Node seventh = new Node(5);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		SinglyLinkedList_remove_duplicate sll = new SinglyLinkedList_remove_duplicate();
		sll.remdup(head);
		}
}
