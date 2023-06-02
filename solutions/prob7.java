//  Optimal Approach - > T.C -> O(n), S.C -> O(1)
public class prob7 {
    
    class Solution {
        public void moveZeroes(int[] nums) {
            int j = 0;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] == 0) {
                    j = i;
                    break;
                }else {
                    j = j + 1;
                }
            }
            
            for(int i = j + 1; i < nums.length; i++) {
                if(nums[i] != 0 && j <= nums.length) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
            }
        }
    }
    
    // brute force Approach -> T.C -> O(2n), S.C -> O(n)
    public static void zerosToEnd(int[] arr) {
    
        int n = arr.length;
        int temp[] = new int[n];  // extra Space O(n)
        int k=0;
        for (int i=0;i<n;i++){
            if (arr[i]!=0){
                temp[k]=arr[i];
                k++;
            }
        }
       
        while (k<n){
            temp[k]=0;
            k++;
        }   
    }
}


