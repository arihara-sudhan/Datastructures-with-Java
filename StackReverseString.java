// Let's Reverse a String using Stack Datastructure 
// Learn Datastructure in Java - Ariharasudhan

class StackReverseString {
	Node top;
	int length;
	private class Node {
		char data;
		Node next;
		Node(char data) {
			this.data = data;
			this.next = null;
		}
	}
	StackReverseString() {
		top = null;
		length = 0;
	}
	public boolean isEmpty(){
		return top==null;
	}
	public int length() {
		return length;
	}
	public String reverse(String STR) {
		char[] chars = STR.toCharArray();
		for(char x:chars)
			push(x);
		for(int x=0;x<chars.length;x++)
			chars[x] = pop();
		return new String(chars);
	}
	public void push(char data) {
		Node temp = new Node(data);
		temp.next = top;
		top = temp;
		length++;
		System.out.printf("%c is Pushed!\n",data);
	}

	public char pop() {
		char temp = top.data;
		top = top.next;
		length--;
		return temp;
	}
	public static void main(String[] args) {
		StackReverseString stk = new StackReverseString();
		System.out.println("Reverse of ARI is "+stk.reverse("ARI"));
	}
}