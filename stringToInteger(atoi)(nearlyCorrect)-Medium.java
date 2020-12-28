class Solution {
    public int myAtoi(String s) {
        
        if(s.length()<=0) return 0;

        int result = 0;

        int i = 0;
        while(i<s.length() && !Character.isDigit(s.charAt(i))) {
            if(s.charAt(i)!=' ' && s.charAt(i)!='-' && s.charAt(i)!='+') return 0;
            if(s.charAt(i)=='-' && i<s.length()-1 && !Character.isDigit(s.charAt(i+1))) return 0;
            if(s.charAt(i)=='+' && i<s.length()-1 && !Character.isDigit(s.charAt(i+1)) ) return 0;

            i++;
        } 

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('0', 0);
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);

        boolean positive = true;

        if(i>0 && s.charAt(i-1)=='-') positive = false;

        int startIndex = i;
        int mul = -1;
        boolean zeroes = true;
        while(i<s.length() && Character.isDigit(s.charAt(i))) {
            if(s.charAt(i)!='0'&&zeroes) {
                zeroes=false;
                startIndex = i;
            }
            if(!zeroes)mul++;
            i++;
        }
            
        i = startIndex; 
        if(mul>=10) {
            System.out.print("HI");      
            if(positive) return Integer.MAX_VALUE;
            else return Integer.MIN_VALUE;
        }

        while(mul>=0) {
            result+=map.get(s.charAt(i))*Math.pow(10, mul);
            System.out.println(s.charAt(i) + " " + mul);
            i++;
            mul--;
        }

        if(positive) return result;
        else return result*-1;

    }

}