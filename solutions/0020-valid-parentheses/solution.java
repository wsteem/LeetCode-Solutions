import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(int i=0; i<s.length(); i++) {
            stack.push(s.charAt(i));
            char c = stack.peek();

            if(c == ')' || c == ']' || c == '}') { 
                stack.pop(); //temperarily remove c
                if (stack.isEmpty()) {
                    return false;
                }
                char opp = getOpposite(c);
                if(opp == stack.peek()) {
                    stack.pop(); // dont add c back, and remove opening bracket
                }
                //else add c back
                else {
                    stack.push(c);
                }
            }
        }
        if(stack.isEmpty() == true) {
            return true;
        }
        return false;
    }

    public char getOpposite(char c) {
        char bracket = ' ';
        switch(c) {
            case ')':
                bracket = '(';
                break;

            case '}':
                bracket = '{';
                break;

            case ']':
                bracket = '[';
                break;
        }
        return bracket;
    }
}
