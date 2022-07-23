// Finding middle node of  a linked list
// Learn Datastructure in Java - Ariharasudhan
	
class SinglyLinkedList_middle_node {
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void mid(Node head) {
		Node stay = head;
		Node move = head;
		while(move!=null && move.next!=null) {
			stay = stay.next;
			move = move.next.next;
		}
		System.out.print(stay.data);
	}
	

	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		SinglyLinkedList_middle_node sll = new SinglyLinkedList_middle_node();
		sll.mid(head);
		}
}
