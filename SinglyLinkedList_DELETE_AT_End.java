// Deleting the last node of the Singly Linked List
// Learn Datastructure in Java - Ariharasudhan
// 1->2->3->null BECOMES 1->2->null as the last element gets deleted

class SinglyLinkedList_DELETE_AT_End {
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void delAtEnd(Node head)	{
		Node prev = null;
		Node cur = head;
		while(cur.next!=null) {
			prev = cur;
			cur = cur.next;
		}
		prev.next = null;
		cur = head;
		while(cur!=null) {
			System.out.printf("%d->",cur.data);
			cur = cur.next;
		}
	}
	

	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		head.next = second;
		second.next = third;
		SinglyLinkedList_DELETE_AT_End sll = new SinglyLinkedList_DELETE_AT_End();
		sll.delAtEnd(head);
	}
}
