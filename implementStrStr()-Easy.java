class Solution {
    
    public int strStr(String haystack, String needle) {
        
        if(needle.length()>haystack.length()) return -1;
        
        if(needle.length()<=0) return 0;

        int hayP = 0;
        int needP = 0;

        while(hayP<=haystack.length()-needle.length()) {
            needP = 0;
            int hayPTemp = hayP;
            if(haystack.charAt(hayPTemp)==needle.charAt(needP)) {
                while(needP<needle.length() && needP<haystack.length()&& haystack.charAt(hayPTemp)==needle.charAt(needP)) {
                    hayPTemp++;
                    needP++;
                }
                if(needP==needle.length()) {
                    return hayP;
                }

            }
            hayP++;
        }
    
        return -1;
        
    }

}