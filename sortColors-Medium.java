class Solution {
    public void sortColors(int [] nums) {

        HashMap<Integer, Integer> set = new HashMap<>();

        int i = 0;
        while(i<nums.length) {
            if(set.containsKey(nums[i])) {
                int tempVal = set.get(nums[i]);
                tempVal++;
                set.put(nums[i], tempVal);
            }
            else {
                set.put(nums[i], 1);
            }
            i++;
        }

        i = 0;
        int arrCount = 0;
        while(i<3) {
            while(set.containsKey(i)) {
                nums[arrCount] = i;
                int tempVal = set.get(i);
                tempVal--;
                if(tempVal==0) set.remove(i);
                if(tempVal>0) set.put(i, tempVal);
                arrCount++;
            }
            i++;
        }




    }

}