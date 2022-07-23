// Merging two sorted Linked Lists
// Learn Datastructure in Java - Ariharasudhan
	
class SinglyLinkedList_LOOP_MERGE_sort {
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void merge(Node head1,Node head2) {
		Node h1 = head1;
		Node h2 = head2;
		Node dummy = new Node(0);
		Node tail = dummy;
		while(h1!=null && h2!=null) {
			if(h1.data<=h2.data) {
				tail.next = h1;
				h1 = h1.next;
			}
			else if(h2.data<=h1.data) {
				tail.next = h2;
				h2 = h2.next;
			}
			tail = tail.next;

		}
		if(h1==null) tail.next = h2;
		else tail.next = h1;
		dummy = dummy.next;
		while(dummy!=null){
			System.out.printf("%d->",dummy.data);
			dummy = dummy.next;
		}
		System.out.println("null");

}	

	public static void main(String[] args) {
		Node head1 = new Node(1);
		Node second1 = new Node(3);
		Node third1 = new Node(5);
		Node fourth1 = new Node(7);
		Node fifth1 = new Node(9);
		head1.next = second1;
		second1.next = third1;
		third1.next = fourth1;
		fourth1.next = fifth1;
		Node head2 = new Node(2);
		Node second2 = new Node(4);
		Node third2 = new Node(6);
		Node fourth2 = new Node(8);
		Node fifth2 = new Node(10);
		head2.next = second2;
		second2.next = third2;
		third2.next = fourth2;
		fourth2.next = fifth2;
		SinglyLinkedList_LOOP_MERGE_sort sll = new SinglyLinkedList_LOOP_MERGE_sort();
		sll.merge(head1,head2);
	}
}
