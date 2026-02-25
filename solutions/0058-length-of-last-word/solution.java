class Solution {
    public int lengthOfLastWord(String s) {

        int pointer = s.length()-1;
        int counter = 0;

        while (Character.isWhitespace(s.charAt(pointer)) && pointer <= s.length()-1 && pointer >= 0) {
            pointer--;
        }
        while (pointer >= 0 && pointer <= s.length() && !Character.isWhitespace(s.charAt(pointer))) {
            pointer--;
            counter++;
        }
        return counter;
    }
}
