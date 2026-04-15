class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int fIndex = 0;
        int bIndex = 0;
        int steps = 0;
        boolean found = false;
        for(int i=0; i<n; i++) {
            
            fIndex = (i+startIndex)%n;
            if(words[fIndex].equals(target)) {
                steps = i;
                found = true;
                break;
            }
            bIndex = (startIndex-i+n)%n;
            if(words[bIndex].equals(target)) {
                steps = i;
                found = true;
                break;
            }
        }
        if(!found) return -1;
        return steps;
    }
}
