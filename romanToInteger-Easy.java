class Solution {
    public int romanToInt(String s) {

        if(s.length()<=0) return 0;

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        StringBuffer buff = new StringBuffer(s);
        int result = 0;

        int i = 0;

        while(i<buff.length()-1) {
            if(map.get(buff.charAt(i))<map.get(buff.charAt(i+1))) {
                result+=map.get(buff.charAt(i+1))-map.get(buff.charAt(i));
                i++;
            }
            else result+=map.get(buff.charAt(i));
            i++;
        }
        if(i<buff.length()) result+=map.get(buff.charAt(i));

        return result;
    }

}

