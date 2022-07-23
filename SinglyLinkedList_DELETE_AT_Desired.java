// Deleting a node at a desired position in the Singly Linked List
// Learn Datastructure in Java - Ariharasudhan
// 1->2->3->null BECOMES 1->3->null as the element at position 1 gets deleted
	
class SinglyLinkedList_DELETE_AT_Desired {
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void delAtDes(Node head,int pos) {
		if(pos==0) 
			head = head.next;
		else {
		Node prev = head;
		int i = 0;
		while(i<pos-1) {
			prev = prev.next;
			i++;
		}
		Node cur = prev.next;
		prev.next = cur.next; }

		Node cur = head;
		while(cur!=null) {
			System.out.printf("%d->",cur.data);
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
		SinglyLinkedList_DELETE_AT_Desired sll = new SinglyLinkedList_DELETE_AT_Desired();
		sll.delAtDes(head,2); 	// Head , Position
	}
}
