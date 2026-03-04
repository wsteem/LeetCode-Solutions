class Solution {
    public String makeGood(String s) {

        StringBuilder builder = new StringBuilder(s);

        int p1 = 0;
        int p2 = 1;
        while(p2<builder.length()) {
            char lowercase1 = builder.charAt(p1);
            char lowercase2 = builder.charAt(p2);
            char uppercase1 = Character.toUpperCase(lowercase1);
            char uppercase2 = Character.toUpperCase(lowercase2);
            if(lowercase1 != lowercase2 && uppercase1 == uppercase2) {
                builder.delete(p1, p2+1);
                p1 = 0;
                p2 = 1;
            }
            else {
                p1++;
                p2++;
            }
        }
        return builder.toString();
    }
}
