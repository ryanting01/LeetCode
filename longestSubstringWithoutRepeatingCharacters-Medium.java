class Solution {
    
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length()<=1) return s.length();

        HashSet<Character> set = new HashSet<>();

        StringBuffer input = new StringBuffer(s);
        StringBuffer currSub= new StringBuffer();
        int tally = 0;
        int max = 0;

        int i = 0;
        while(i<input.length()) {
            if(set.contains(input.charAt(i))) {
                int count = 0;
                while(currSub.charAt(0)!=input.charAt(i)) {
                    set.remove(currSub.charAt(0));
                    currSub.deleteCharAt(0);
                    count++;
                    tally--;
                }
                currSub.deleteCharAt(0);
                currSub.append(input.charAt(i));
            }
            else {
                currSub.append(input.charAt(i));
                set.add(input.charAt(i));
                tally++;
                max = Math.max(tally, max);
            }

            i++;
        }
        return max;

    }
}

/*
Test case for an empty string, and one with one letter
*/