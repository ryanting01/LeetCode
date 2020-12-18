class Solution {
        
    public List<String> generateParenthesis(int n) {
        
        List<String> result = new ArrayList<>();
        StringBuffer input = new StringBuffer("");
        helper(n, result, input, 0, 0);
        
        return result;
        
    }
    
    public void helper(int n, List<String> result, StringBuffer curr, int open, int close) {
        
        if(curr.length()==n*2) {
            result.add(curr.toString());
            return;
        }
        
        if(open<n) {
            helper(n, result, curr.append("("), open+1, close);
            curr.deleteCharAt(curr.length()-1);
        }
        if(close<open) {
            helper(n, result, curr.append(")"), open, close+1);
            curr.deleteCharAt(curr.length()-1);

        } 
        
        
    }
    
}