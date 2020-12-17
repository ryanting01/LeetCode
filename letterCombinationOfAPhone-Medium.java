class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> result = new ArrayList<>();
        if(digits!=null && digits.length()>0) {
            String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
            helper(digits, map, result, new StringBuffer(), 0);
        }
        return result;
        
    }
    
    public void helper (String digits, String [] map, List<String> result, StringBuffer s, int i) {
        
        if(i==digits.length()) {
            result.add(s.toString());
            return;
        }
        
        int digit = Character.getNumericValue(digits.charAt(i));
        String letters = map[digit];
        
        for(int j = 0; j<letters.length(); j++) {
            char ch = letters.charAt(j);
            s.append(ch);
            helper(digits, map, result, s, i+1);
            s.deleteCharAt(s.length()-1);
        }
        
    }
    
}