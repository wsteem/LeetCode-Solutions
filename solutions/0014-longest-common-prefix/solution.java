class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];
        
        for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(prefix)) { 
                String tempPrefix = "";
                for (int j = 0; j < prefix.length()-1; j++) { 
                    tempPrefix += prefix.charAt(j); 
                }
                prefix = tempPrefix;
            }
        }
        return prefix;
    }
}
