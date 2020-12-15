class Solution {
    public List<List<Integer>> threeSum(int [] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        int mainPoint = 0;
        while(mainPoint<nums.length) {
            int startPoint = mainPoint+1;
            int endPoint = nums.length-1;
            
            while(startPoint<endPoint && startPoint>0 && endPoint<=nums.length-1) {
                List<Integer> tempRes = new ArrayList<>();
                int currRes = nums[mainPoint]+nums[startPoint]+nums[endPoint];
                if(currRes ==0) {
                    tempRes.add(nums[startPoint]);
                    tempRes.add(nums[endPoint]);
                    tempRes.add(nums[mainPoint]);
                    result.add(tempRes);
                    tempRes = new ArrayList<>();
                    startPoint++;
                }
                else if(currRes>0) {
                    endPoint--;
                }
                else if(currRes<0) startPoint++;
                int count = 0;
                while(count<result.size()-1) {
                    int count2 = 0;
                    boolean remove = true;
                    while(count2<3) {
                        if(result.get(count).get(count2)!=result.get(result.size()-1).get(count2)) remove = false;
                        count2++;
                    }
                    if(remove) result.remove(result.size()-1);
                    count++;
                }
                
            }

            mainPoint++;
        }

        return result;
    }

}