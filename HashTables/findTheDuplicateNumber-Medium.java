class Solution {
    public int findDuplicate(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int i = 0;
        while(i<nums.length) {
            if(set.contains(nums[i])) {
                return nums[i];
            }
            else {
                set.add(nums[i]);
            }
            
            i++;
        }
        return nums[i];
        
    }
}