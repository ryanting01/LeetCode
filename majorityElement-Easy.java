class Solution {
    public int majorityElement(int [] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        if(nums.length==1) return nums[0];

        int topVal = 0;
        int topNum = 0;

        int i = 0;
        while(i<nums.length) {
            if(map.containsKey(nums[i])) {
                int currVal = map.get(nums[i]);
                currVal++;
                map.put(nums[i], currVal);
                if(currVal>topVal) {
                    topVal = currVal;
                    topNum = nums[i];
                }
            }
            else {
                map.put(nums[i], 1);
            }

            i++;
        }
        return topNum;


    }

}