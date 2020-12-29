class Solution {
    public int maxSubArray(int[] num) {

        int maxSum = Integer.MIN_VALUE;
        int i = 0, currSum=0;

        while(i<num.length) {
            if(num[i]>currSum+num[i]) currSum=num[i];
            else {
                currSum+=num[i];
            }
            maxSum = Math.max(maxSum, currSum);
            i++;
        }
        return maxSum;
    }

}