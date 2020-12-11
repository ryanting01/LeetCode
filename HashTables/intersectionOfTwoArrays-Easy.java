class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<Integer>();
        
        int i = 0;
        while(i<nums1.length) {
            if(map.containsKey(nums1[i])) {
                int newVal = map.get(nums1[i])+1;
                map.put(nums1[i], newVal);
            }
            else {
                map.put(nums1[i], 1);
            }
            i++;
        }
        
        i = 0;
        while(i<nums2.length) {
            if(map.containsKey(nums2[i])) {
                result.add(nums2[i]);
                if(map.get(nums2[i])>1) {
                    map.put(nums2[i], map.get(nums2[i])-1);
                }
                else if(map.get(nums2[i])==1) {
                    map.remove(nums2[i]);
                }
            }
            i++;
        }
        int [] answer = new int[result.size()];
        i = 0;
        while(i<result.size()) {
            answer[i] = result.get(i);
            i++;
        }
        return answer;
    }
}