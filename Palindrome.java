// Let's check whether a given string is palidrome or not 
// Learn Datastructure in Java - Ariharasudhan

class Palindrome {
	public boolean isPalind(String str) {
		char[] CharArray = str.toCharArray();
		int start = 0;
		int last = CharArray.length-1;
		while(start<last) {
			if(CharArray[start]!=CharArray[last])
				return false;
			start++;
			last--;
		}
		return true;
	}
	public static void main(String[] args) {
		Palindrome pl = new Palindrome();
		if(pl.isPalind("amma"))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}