class Solution {
    public int removeElement(int [] nums, int val) {



        List<Integer> indexes = new ArrayList<>();
        int newLength = nums.length;

        int i = 0;
        while(i<nums.length) {
            if(nums[i]==val) {
                indexes.add(i);
                newLength--;
            }
            i++;
        }

        i = newLength;
        int arrCount = 0;
        while(i<nums.length) {
            if(nums[i]!=val) {
                nums[indexes.get(arrCount)]=nums[i];
                arrCount++;
            }
            i++;
        }
        return newLength;
    }

}