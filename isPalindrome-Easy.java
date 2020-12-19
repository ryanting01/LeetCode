class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        if(s.length()<=1) return true;

        StringBuffer buff = new StringBuffer(s);


        int i = 0;
        while(i<buff.length()) {
            if(!Character.isLetter(buff.charAt(i)) && !Character.isDigit(buff.charAt(i))) {                
                buff.deleteCharAt(i);
                i--;
            }
            i++;
        }
        System.out.print(buff.toString());

        
        int start = 0;
        int end = buff.length()-1;
        while(start<end) {
            if(buff.charAt(end)!=buff.charAt(start)) return false;
            else {
                start++;
                end--;
            }

        }


        return true;
    }


}