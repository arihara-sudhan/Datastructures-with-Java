// Let's print elements in a Doubly Linked List
// Learn Datastructure in Java - Ariharasudhan
	
class DoublyLinkedListPrint {
	private Node head;
	private Node tail;
	private int len;
	private static class Node {
		private int data;
		private Node next;
		private Node prev;
		public Node(int data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
	public DoublyLinkedListPrint(Node head,Node tail,int length) {
		this.head = head;
		this.tail = tail;
		this.len = length;
	}
	boolean isEmpty() {
		return len==0;
	} 
	int length() {
		return len;
	}
	void printForwards(){
		if(head == null)
			return;
		Node temp = head;
		System.out.println("Printing Forwards");
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	void printBackwards(){
		if(head == null)
			return;
		Node temp = tail;
		System.out.println("Printing Backwards");
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.prev;
		}
	}
	void printBackwards(Node tail){

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
		sixth.prev = fifth;
		fifth.prev = fourth;
		fourth.prev = third;
		third.prev = second;
		second.prev = head;
		DoublyLinkedListPrint dll = new DoublyLinkedListPrint(head,sixth,6);
		dll.printForwards();
		dll.printBackwards();
	}
}
