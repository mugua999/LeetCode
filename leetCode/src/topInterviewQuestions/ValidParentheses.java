package topInterviewQuestions;

import java.util.Stack;

public class ValidParentheses {
	public static void main(String[] args) {
		ValidParentheses vp = new ValidParentheses();
		System.out.println(vp.isValid("]]"));
	}
	
	public boolean isValid(String s) {
		if (s.length() % 2 == 1) return false;
		
        Stack<Character> sta = new Stack<>();
        
        for(char c : s.toCharArray()){
            if (c == '{' || c == '[' || c== '('){
                sta.push(c);
            } else if (c == '}' && !sta.isEmpty() && sta.peek() == '{'){
                sta.pop();
            } else if (c == ']' && !sta.isEmpty() && sta.peek() == '['){
                sta.pop();
            } else if (c == ')' && !sta.isEmpty() && sta.peek() == '('){
                sta.pop();
            } else return false;
        }
        
        return sta.isEmpty();
	}
}
