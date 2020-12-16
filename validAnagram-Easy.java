class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;

        char [] sChar = s.toCharArray();
        char [] tChar = t.toCharArray();

        quickSort(sChar, 0, s.length()-1);
        quickSort(tChar,0,t.length()-1);
        
        // Arrays.sort(sChar);
        // Arrays.sort(tChar);
        
        int i = 0;
        System.out.println(Arrays.toString(sChar));
        while(i<t.length()) {
            if(sChar[i]!=tChar[i]) return false;
            i++;
        }
        return true;
    }

    public void quickSort(char [] arr, int l, int r) {

        if(l<r) {
            int pi = partition(arr, l, r);

            quickSort(arr, l, pi-1);
            quickSort(arr, pi+1, r);

        }

    }

    public int partition(char[]arr, int l, int r) {

        int pivot = arr[r];
        int i = l;
        int j = l-1;
        while(i<r) {
            if(arr[i]<pivot) {
                j++;
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
        }
        char temp = arr[j+1];
        arr[j+1] = arr[r];
        arr[r] = temp;
        return j+1;
    }

}