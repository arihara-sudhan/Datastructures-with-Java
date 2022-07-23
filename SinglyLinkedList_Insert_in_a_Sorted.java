// Inserting in a sorted linked list
// Learn Datastructure in Java - Ariharasudhan
	
class SinglyLinkedList_Insert_in_a_Sorted {
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void insert(int data,Node head) {
		Node in = new Node(data);
		Node cur = head;
		while(cur!=null){
			if(cur.data<=data && data<=cur.next.data){
				System.out.printf("Inserted between %d and %d\n",cur.data,cur.next.data);
				Node temp = cur;
				cur.next = in;
				in.next = temp.next;
				break;
			}
			cur = cur.next;
		}
	}
	

	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(7);
		Node seventh = new Node(8);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = seventh;
		SinglyLinkedList_Insert_in_a_Sorted sll = new SinglyLinkedList_Insert_in_a_Sorted();
		sll.insert(6,head);		// Data , Head
		}
}
