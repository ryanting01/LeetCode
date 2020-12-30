class Solution {
    public String longestPalindrome(String s) {

        if(s.length()<=1) return s;

        int maxLength=0, i = 0;
        String result = "";
        String tempResEven = "";
        String tempResOdd="";

        while(i<s.length()) {
            tempResOdd = expand(s, i, false);
            tempResEven = expand(s, i, true);
            if(tempResOdd.length()>tempResEven.length()) {
                if(tempResOdd.length()>result.length()) {
                    result = new String(tempResOdd);
                }
            }
            else {
                if(tempResEven.length()>result.length()) {
                    result = new String(tempResEven);
                }

            }
            i++;
        }
        return result;



    }

    public String expand(String s, int i, boolean even) {

        int result = 0;
        StringBuffer tempRes = new StringBuffer();
        if(!even) {
            tempRes.append(s.charAt(i));
        int l=i-1, r=i+1;
        while( l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) {
            tempRes.insert(0, s.charAt(l));
            tempRes.insert(tempRes.length(), s.charAt(r));
            l--;
            r++;
        }
        return tempRes.toString();
        }
        else {
            int l=i, r=i+1;
            while( l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)) {
            tempRes.insert(0, s.charAt(l));
            tempRes.insert(tempRes.length(), s.charAt(r));
                l--;
                r++;
            }
        }

        return tempRes.toString();
    }


}