// Let's detect loop in a linked list
// Learn Datastructure in Java - Ariharasudhan
	
class SinglyLinkedList_LOOP_Detection {
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	boolean detect(Node head) {
		Node fast = head;
		Node slow = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast)
				return true;
		}
		return false;
	}
	

	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		head.next = second;
		second.next = third;
		third.next = second;
		SinglyLinkedList_LOOP_Detection sll = new SinglyLinkedList_LOOP_Detection();
		if(sll.detect(head))
			System.out.println("There is a loop");
		else
			System.out.println("No Loop");
	}
}
