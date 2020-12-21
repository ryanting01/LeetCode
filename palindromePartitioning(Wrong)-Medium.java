class Solution {
    public List<List<String>> partition(String s) {

        StringBuffer sBuff = new StringBuffer(s);
        List<List<String>> result = new ArrayList<>();

        int sizeSub = 1;
        while(sizeSub<=sBuff.length()) {
            int start = 0;
            List<String> tempResList = new ArrayList<>();
            while((start+sizeSub)<=sBuff.length()) {
                StringBuffer tempRes = new StringBuffer();
                int count = start;
                while(count<sizeSub+start) {
                    tempRes.append(sBuff.charAt(count));
                    count++;
                }
                if(isPalindrome(tempRes.toString())) tempResList.add(tempRes.toString());
                start++;
            }
            result.add(tempResList);
            sizeSub++;
        }
        return result;


    }


    public boolean isPalindrome(String s) {

        if(s.length()<=1) return true;

        StringBuffer buff = new StringBuffer(s);

        int l = 0;
        int r = buff.length()-1;
        while(l<r) {
            if(buff.charAt(l)!=buff.charAt(r)) return false;
            else {
                l++;
                r--;
            }
        }
        return true;

    }

    
    
    
}