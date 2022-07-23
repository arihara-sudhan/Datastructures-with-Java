// Implementation of Singly Linked List
// Learn Datastructure in Java - Ariharasudhan

class SinglyLinkedList {
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		head.next = second;
		second.next = third;
				Node curr = head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr = curr.next;
		}

	}
}