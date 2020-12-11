class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        int i = 0;
        while(i<nums.length) {
            if(map.containsKey(nums[i])) {
                if(i-map.get(nums[i])<=k) return true;
                else {
                    map.put(nums[i], i);
                }
            }
            else {
                map.put(nums[i], i);
            }
            i++;
        }
        return false;
    }
}