class Solution {
    public List<List<Integer>> subsets(int [] nums) {

        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i<nums.length+1; i++) {
            dfs(result, new ArrayList<Integer>(), nums, i, 0);
        }

        return result;

    }

    public void dfs (List<List<Integer>> result, List<Integer> curr, int [] nums, int i, int first) {

        if(curr.size()==i) {
            result.add(new ArrayList(curr));
            return;
        }

        for(int k=first; k<nums.length;k++) {
            curr.add(nums[k]);
            dfs(result, curr, nums, i, k+1);
            curr.remove(curr.size()-1);
        }


    }

}