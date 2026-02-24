class Solution {
    public int strStr(String haystack, String needle) {

        int p1 = 0;
        int p2 = 0;
        int nIndex = 0;
        int needleLen = needle.length()-1;

        while(p2 < haystack.length()) {

            if (haystack.charAt(p2) == needle.charAt(nIndex)) {

                if (nIndex == needleLen) {
                    return p1;
                }

                //p1 stays same
                nIndex++;
                p2++;
            }
            else{
                p1++;
                p2 = p1;
                nIndex = 0;
            }
        }
        return -1;
    }
}
