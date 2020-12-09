class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        // List<List<String>> result = new ArrayList<List<String>>();
//         int resultCounter = 0;
        
//         int i = 0;
//         while(i< strs.length) {
//             List<String> tempRes = new ArrayList<String>();
//             int count = i+1;
//             while(count<strs.length) {
//                 // System.out.println(isAnagram(strs[i], strs[count]));
//                 if(isAnagram(strs[i], strs[count])) {
//                     tempRes.add(strs[count]);
//                 }
//                 count++;
//             }
//             tempRes.add(strs[i]);
//             result.add(tempRes);
//             i++;
//         }
//         return result;
        
        if (strs.length == 0) return new ArrayList();
        Map<String, List> result = new HashMap<String, List>();
        
        int i = 0;
        while(i<strs.length) {
            
            char[] charArr = strs[i].toCharArray();
            quickSort(charArr, 0, charArr.length-1);
            String key = String.valueOf(charArr);
            if(!result.containsKey(key)) result.put(key, new ArrayList());
            result.get(key).add(strs[i]);
            i++;
        }
        return new ArrayList(result.values());
        
    }
    
    public boolean isAnagram(String x, String y) {
        
        if(x.length()!=y.length()) return false;
        char[] xArr = x.toCharArray();
        char[] yArr = y.toCharArray();

        quickSort(xArr, 0, xArr.length-1);
        quickSort(yArr, 0, yArr.length-1);
        
        // System.out.println(String.valueOf(xArr));
        // System.out.println(String.valueOf(yArr));

        
        if(String.valueOf(xArr).equals(String.valueOf(yArr))) return true;
        else return false;
        
    }
    
    public void quickSort(char [] arr, int l, int h) {
        
        if(l<h) {
            
            int pi = partition(arr, l, h);
            
            quickSort(arr, l, pi-1);
            quickSort(arr, pi+1, h);
            
        }
    }
    
    public static int partition(char [] arr, int l, int h) {
        
        int pivot = arr[h];
        
        int i = l;
        int j = i-1;
        
        while(i<h) {
            if(arr[i]<pivot) {
                j++;
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
        }
        char temp = arr[j+1];
        arr[j+1] = arr[h];
        arr[h] = temp;
        return j+1;
    }
    
}