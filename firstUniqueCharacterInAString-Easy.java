class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int i = 0;
        while(i<s.length()) {
            if(map.containsKey(s.charAt(i))) {
                int currValue = map.get(s.charAt(i))+1;
                map.put(s.charAt(i), currValue);
            }
            else {
                map.put(s.charAt(i), 1);
            }
            i++;
        }
        i = 0;
        
        while(i<s.length()) {
            if(map.get(s.charAt(i))==1) {
                return i;
            }
            i++;
        }
        return -1;
    }
}