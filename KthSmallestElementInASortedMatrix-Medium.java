class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        int [] nums = new int[matrix.length*matrix.length];
        int row = 0;
        int arrCount = 0;

        while(row<matrix.length) {
            int col = 0;
            while(col<matrix.length) {
                nums[arrCount] = matrix[row][col];
                col++;
                arrCount++;	
            }
            row++;
        }
        quickSort(nums, 0, nums.length-1);
        return nums[k-1];


    }


    public void quickSort(int[] arr, int l, int r) {

        if(l<r){
            int pi = partition(arr, l, r);

            quickSort(arr, l, pi-1);
            quickSort(arr, pi+1, r);
        }
    }

    public int partition(int[] arr, int l, int r) {

        int pivot = arr[r];
        int i = l;
        int j = i-1;

        while(i<r) {
            if(arr[i]<pivot) {
                j++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            i++;
        }
        int temp = arr[j+1];
        arr[j+1] = arr[r];
        arr[r] = temp;
        return j+1;
    }

}