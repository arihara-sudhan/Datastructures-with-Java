// Deleting the first node of the Singly Linked List
// Learn Datastructure in Java - Ariharasudhan
// 1->2->3->null BECOMES 2->3->null as the first element gets deleted

class SinglyLinkedList_DELETE_AT_Beg {
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void delAtBeg(Node head)	{
		head = head.next;
		Node cur = head;
		while(cur!=null) {
			System.out.print(cur.data+"->");
			cur = cur.next;
		}
		System.out.print("null");
	}
	

	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		head.next = second;
		second.next = third;
		SinglyLinkedList_DELETE_AT_Beg sll = new SinglyLinkedList_DELETE_AT_Beg();
		sll.delAtBeg(head);
	}
}
