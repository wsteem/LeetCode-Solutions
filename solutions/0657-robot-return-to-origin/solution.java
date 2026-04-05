import java.util.Stack;

class Solution {
    public boolean judgeCircle(String moves) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        
        for(int i=0; i<moves.length(); i++){
            if(moves.charAt(i) == 'U' || moves.charAt(i) == 'D'){
                stack1.push(moves.charAt(i));
            }
            else if(moves.charAt(i) == 'R' || moves.charAt(i) == 'L'){
                stack2.push(moves.charAt(i));
            }
        }

        int upDown = 0;
        int rightLeft = 0;
        int pop;

        while(!stack1.isEmpty()){
            pop = stack1.pop();
            if(pop == 'U'){ upDown++; }
            else if(pop == 'D'){ upDown--; }
        }
        while(!stack2.isEmpty()){
            pop = stack2.pop();
            if(pop == 'R'){ rightLeft++; }
            else if(pop == 'L'){ rightLeft--; }
        }

        return upDown == 0 && rightLeft == 0;
    }
}
