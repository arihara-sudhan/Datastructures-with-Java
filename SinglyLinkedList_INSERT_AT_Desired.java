// Inserting a new node at the desired position of the Singly Linked List
// There are only three nodes! Be aware of it!
// Learn Datastructure in Java - Ariharasudhan

class SinglyLinkedList_INSERT_AT_Desired {
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void insertAtPos(int pos,int data,int len,Node head)	{
		Node New = new Node(data);
		int i = 0;
		Node cur = head;
		while(i<len) {
			if(pos==i+1) {
				Node temp = cur.next;
				cur.next = New;
				New.next = temp;
			}
			i++;
			cur = cur.next;
		}
		cur = head;
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
		SinglyLinkedList_INSERT_AT_Desired sll = new SinglyLinkedList_INSERT_AT_Desired();
		sll.insertAtPos(1,4,3,head);	//Pos , Data, Length, Head
	}
}
