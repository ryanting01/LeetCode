class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        Map<String, Integer> list1Map = new HashMap<>();
        ArrayList<String> result = new ArrayList<String>();
        
        int i = 0;
        while(i<list1.length) {
            list1Map.put(list1[i], i);
            i++;
        }
        
        i = 0;
        int lowestSum = Integer.MAX_VALUE;
        while(i<list2.length) {
            if(list1Map.containsKey(list2[i])) {
                int indexSum = list1Map.get(list2[i])+i;
                if(indexSum<lowestSum) lowestSum = indexSum;
            }
            i++;
        }
        i = 0;
        int arrCount = 0;
        while(i<list2.length) {
            if(list1Map.containsKey(list2[i])) {
                int indexSum = list1Map.get(list2[i])+i;
                if(indexSum==lowestSum) {
                    result.add(list2[i]);
                    arrCount++;
                }
            }
            i++;
        }
        String [] answer = new String [result.size()];
        answer = result.toArray(answer);
        return answer;
    }
}

/*



*/