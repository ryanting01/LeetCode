class Solution {
    public int minSubArrayLen(int s, int [] nums) {

        if(nums.length<=0) return 0;

        int end = 0, start = 0, result = Integer.MAX_VALUE, tally = 0, runningRes = 0;;

        while(end<nums.length) {
            tally+=nums[end];
            while(start<=end&&tally>=s) {
                runningRes = end-start+1;
                result = Math.min(runningRes, result);
                tally-=nums[start];
                start++;
            }
            end++;
        }
        if(result==Integer.MAX_VALUE) return 0;
        return result;
    }

}