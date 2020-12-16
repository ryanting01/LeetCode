class Solution {
    public int missingNumber(int [] nums) {

        HashSet<Integer> set = new HashSet<>();
        int i = 0;
        while(i<nums.length) {
            set.add(nums[i]);
            i++;
        }
        i = 0;
        while(i<nums.length) {
            if(!set.contains(i)) return i;
            i++;
        }
	    return nums.length;
    }

}