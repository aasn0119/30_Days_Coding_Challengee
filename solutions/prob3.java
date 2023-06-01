
//  Most optimal Solution with T.C -> O(n) and S.C -> O(1)...!

class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        for(int i = 1; i < n; i++) {
            if(arr[i] >= arr[i - 1]) {
                // leave as it is..1
            }else {
                return false;
            }
        }
        return true;
    }
}