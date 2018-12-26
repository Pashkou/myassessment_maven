package siarhei.pashkou.myassessment;

import java.util.Stack;

public class BraceChecker {
	public boolean isValid(String braces) {
		if (braces.isEmpty())
	        return true;

	    Stack<Character> stack = new Stack<Character>();
	    
	    for (int i = 0; i < braces.length(); i++)
	    {
	        char current = braces.charAt(i);
	        
	        if (isOpenBracket(current)){
	            stack.push(current);
	        } else if (isCloseBracked(current)) {
	            if (stack.isEmpty()) {
	                return false;
	            }
	            
	            char last = stack.peek();
	            if (isBracketCorrespond(current, last)) {
	                stack.pop();
	            }else { 
	                return false;
	            }
	        }

	    }

	    return stack.isEmpty();
	}

	private boolean isBracketCorrespond(char current, char last) {
		return current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[';
	}

	private boolean isCloseBracked(char current) {
		return current == '}' || current == ')' || current == ']';
	}

	private boolean isOpenBracket(char current) {
		return current == '{' || current == '(' || current == '[';
	}
}
