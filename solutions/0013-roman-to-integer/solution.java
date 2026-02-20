class Solution {

    public int valueOfChar(char c) {
        int value = 0;
        switch(c) {
            case 'I':
                value = 1;
                break;
            case 'V':
                value = 5;
                break;
            case 'X':
                value = 10;
                break;
            case 'L':
                value = 50;
                break;
            case 'C':
                value = 100;
                break;
            case 'D':
                value = 500;
                break;
            case 'M':
                value = 1000;
                break;
            default:
                value = 0;
                break;
        }
        return value;
    }

    public int romanToInt(String s) {
        //s = III
        int sum = 0;

        if (s.length() <= 1) {
            sum = valueOfChar(s.charAt(0));
            return sum;
        }

        for (int i = 1; i < s.length(); i++) {

            int value1 = valueOfChar(s.charAt(i-1)); // 1.  1
            int value2 = valueOfChar(s.charAt(i)); // 1.   1

            if (value1 < value2) {
                sum -= value1;
            }
                
            else if (value1 >= value2) { // 1 = 1
                sum += value1; // 0 + 1 = 1.  sum = 1.  sum = 2.
            }
            
            if (i == s.length()-1) {
                sum += value2;
            }
        }

        return sum;
    }
}
