class Solution {
    public int titleToNumber (String s) {
        StringBuffer buff = new StringBuffer(s);
        int i = buff.length()-2;
        int result = 0;
        int runningMul = 1;
        while(i>=0) {
            result+=(buff.charAt(i)-64)*(runningMul*26);
            i--;
            runningMul*=26;
        }
        result+=buff.charAt(buff.length()-1)-64;
        return result;
    }


}