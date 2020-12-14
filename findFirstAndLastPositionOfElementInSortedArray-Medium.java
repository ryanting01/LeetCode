class Solution {
    
    
    public int[] searchRange(int [] nums, int target) {

        int [] result = new int [2];
        // if(nums[0]==target && nums[nums.length-1]==target) {
        //     result[1] = nums.length-1;
        //     result[0] = 0;
        //     return result;
        // }
        result[0] = binarySearchLow(nums, 0, nums.length-1, target);
        result[1] = binarySearchHigh(nums, 0, nums.length-1, target);
        return result;
    }

    public int binarySearchLow(int [] nums, int l, int h, int target) {
        if(l<=h) {
            int mid = (h+l)/2;
            if(mid==0&&nums[mid]==target || nums[mid]==target && nums[mid-1]!=target) {
                return mid;
            }
            if(nums[mid]<target) return binarySearchLow(nums, mid+1, h, target);
            else return binarySearchLow(nums, l, mid-1, target);
        }
        return -1;
    }

    public int binarySearchHigh(int [] nums, int l, int h, int target) {
        if(l<=h) {
            int mid = (h+l)/2;
            System.out.print(mid);
            if(mid==nums.length-1&&nums[mid]==target || nums[mid]==target && nums[mid+1]!=target) {
                
                return mid;
            }
            if(nums[mid]<=target) return binarySearchHigh(nums, mid+1, h, target);
            else return binarySearchHigh(nums, l, mid-1, target);
        }
        return -1;
    }

    
    
    
    
// public int [] searchRange(int [] nums, int target) {

//     	int [] result = new int[2];

// 	if(nums.length==0) {
// 		result[0] = -1;
// 		result[1] = -1;
// 		return result;
// 	}

// 	int h = nums[nums.length-1];
// 	int l = nums[0];
// 	if(target<l || target>h) {
// 		result[0] = -1;
// 		result[1] = -1;
// 		return result;
// 	}
	
// boolean changed = false;
// 	int i = 0;
// 	boolean inTarget = false;
// 	while(i<nums.length) {
// 		if(i==0 && nums[i]==target) {
// 			result[0] = i;
// 			changed=true;
// 		}
// 		else if(nums[i]==target && nums[i-1]!=target) {
// 			result[0] = i;
// 			changed=true;
// 		}
// 		if(i==nums.length-1 && nums[i]==target) {
// 			result[1] = i;
// 			changed=true;
// 		}
// 		else if(nums[i]==target && nums[i+1]!=target) {
// 			result[1] = i;
// 			changed=true;
// 		}
// 		i++;
// 	}
// 	if(!changed) {
// 		result[0]=-1;
// 		result[1] = -1;
// 	}
// 	return result;
	
// }


}