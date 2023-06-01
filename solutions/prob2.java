
//  Optimal Solution with T.C -> O(n) and S.C -> O(1)..!

class Solution {  
    int print2largest(int arr[], int n) {
        int large = -1, slarge = -1;
        for(int i = 0; i < n; i++) {
            if(large < arr[i]) {
                slarge = large;
                large = arr[i];
            }else if(arr[i] < large && arr[i] > slarge) {
                slarge = arr[i];
            }
        }
        return slarge;
    }
}