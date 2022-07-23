// Let's remove the loop in a linked list
// Learn Datastructure in Java - Ariharasudhan
	
class SinglyLinkedList_LOOP_Removal {
	private static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	boolean detect(Node head) {
		Node Head = head;
		Node fast = head;
		Node slow = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow==fast) {
				int i = 0;
				while(Head.next!=slow.next) {
					slow = slow.next;
					Head = Head.next;
					i++;
				}
				System.out.printf("Loop starts at position %d\n",i+1);
				slow.next = null;
				System.out.println("Successfully Removed the Loop");
				Head = head;
				while(Head!=null) {
					System.out.printf("%d->",Head.data);
					Head = Head.next;
				}
				System.out.println("null");
				return false;
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = third;
		SinglyLinkedList_LOOP_Removal sll = new SinglyLinkedList_LOOP_Removal();
		if(sll.detect(head))
			System.out.println("There is a loop");
		else
			System.out.println("No Loop");
	}
}
