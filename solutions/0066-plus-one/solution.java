class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length-1;
        
        if(digits[length] != 9) {
            digits[length] += 1;
            return digits;
        }

        for(int i = length; i >= 0; i--) {
            if(digits[i] != 9) break;
            if(i == 0) {
                int[] newDigits = new int[length+2];
                newDigits[0] = 1;
                for(int j=1; j < newDigits.length; j++) {
                    newDigits[j] = 0;
                }
                return newDigits;
            }
        }

        int x = length;
        while(x >= 0) {
            if(digits[x] != 9) {
                digits[x] += 1;
                for(int i=x+1; i <= length; i++) {
                    digits[i] = 0;
                }
                return digits;
            }
            x--;
        }
        return digits;   
    }    
}
