// Finding nth node from the end
// Learn Datastructure in Java - Ariharasudhan
	
class SinglyLinkedList_nth_node_FROM_END {
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void nthfromtheend(Node head,int pos) {
		Node stay = head;
		Node move = head;
		int c = 0;
		while(c<pos) {
			c++;
			move = move.next;
		}

		while(move!=null) {
			stay = stay.next;
			move = move.next;
		}
		System.out.print(stay.data);
	}
	

	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = null;
		SinglyLinkedList_nth_node_FROM_END sll = new SinglyLinkedList_nth_node_FROM_END();
		sll.nthfromtheend(head,2);	// 	Head,Pos
	}
}
