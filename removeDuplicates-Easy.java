class Solution {
    public int removeDuplicates(int [] nums) {

        int p1 = 1, p2 = 1;

        while(p2<nums.length) {
            if(nums[p2]!=nums[p2-1]) {
                nums[p1] = nums[p2];
                p1++;
            }
            p2++;
        }
        return p1;

    }


}