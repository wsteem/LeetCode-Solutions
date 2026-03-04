class Solution {
    public String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();

        int p1 = 0;
        int p2 = 1;
        while(p2<s.length()) {
            if (s.charAt(p2) == ' ' || p2==s.length()-1) {
                p1 = p2;
                if(s.charAt(p1) == ' ') {
                    p1--;
                }
                while(p1>= 0) {
                    if(p1==0) {
                        builder.append(s.charAt(p1));
                        builder.append(' ');
                        p1=0;
                    }
                    else if(s.charAt(p1) == ' ') {
                        builder.append(' ');
                        p1 = 0;
                    }
                    else {
                        builder.append(s.charAt(p1));
                    }
                    p1--;
                }
            }
            p2++;
        }
        builder.delete(builder.length()-1, builder.length());
        return builder.toString();
    }
}
