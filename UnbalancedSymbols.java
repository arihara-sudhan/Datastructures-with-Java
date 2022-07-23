import java.util.Stack;
class UnbalancedSymbols {
	public boolean isBalanced(String str) {
		Stack<Character> stk = new Stack<>();
		char[] STR = str.toCharArray();
		for(char x:STR){
			if(x=='{'||x=='('||x=='[')
				stk.push(x);
			else {
				if(stk.isEmpty())
					return false;
				else {
					char top = stk.peek();
					if(top=='{' && x=='}' ||top=='('&&x==')' ||top=='[' && x==']')
						stk.pop();
					else
						return false;
				}
			}
		}
		return stk.isEmpty();
	}
	public static void main(String[] args){
		UnbalancedSymbols ubs = new UnbalancedSymbols();
		System.out.println(ubs.isBalanced("((([])))"));
	}
}