// Serching an element in the Singly Linked List
// Learn Datastructure in Java - Ariharasudhan
	
class SinglyLinkedList_SEARCH {
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	void search(int data,Node head) {
		Node cur = head;
		int i = 0;
		while(cur!=null) {
			if(cur.data==data){
				System.out.printf("%d is found at position %d",data,i);
				break;
			}
			else {
				cur=cur.next;
				i++;
			}
		}
		if(cur==null) System.out.print("Not Found");
	}
	

	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		head.next = second;
		second.next = third;
		SinglyLinkedList_SEARCH sll = new SinglyLinkedList_SEARCH();
		sll.search(2,head); 	// Data
	}
}
