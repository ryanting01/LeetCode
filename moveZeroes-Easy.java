class Solution {
    public void moveZeroes(int[] nums) {
        
        int i1 = 0;
        while(i1<nums.length) {
            if(nums[i1]==0) {
                int i2 = i1+1;
                while(i2<nums.length) {
                    if(nums[i2]!=0) {
                        int temp = nums[i1];
                        nums[i1] = nums[i2];
                        nums[i2] = temp;
                        i2 = nums.length+1;
                    }
                    i2++;
                }
            }
            i1++;
        }
        
    }
}

/*
have 2 pointers
one at the first zero, and then the second one keeps going till it find a number which isnt 0, then swap. Then iterate 
the behind pointer till it hits a zero and go again

1, 2, 5, 7, 0, 0, 7

*/