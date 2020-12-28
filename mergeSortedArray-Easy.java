class Solution {
    public int [] merge(int [] nums1, int m, int []nums2, int n) {

        int n1 = 0, n2 = 0;
        int [] result = new int[n+m];
        int k= 0;

        while(n1<m && n2<n) {
            if(nums1[n1]<=nums2[n2]) {
                result[k] = nums1[n1];
                n1++;
            }
            else {
                result[k] = nums2[n2];
                n2++;
            }
            k++;
        }

        while(n1<m) {
            result[k] = nums1[n1];
            k++;
            n1++;
        }
        while(n2<n) {
            result[k]=nums2[n2];
            k++;
            n2++;
        }
        
        int i = 0;
        while(i<nums1.length) {
            nums1[i] = result[i];
            i++;
        }
        
        return result;

    }


}











