
//  As in Question it is asked to solve the problem in O(log n) T.C thus we are simply gonna use    Binary Search, there is no need for brute or better approach...!


public class prob8 {


    class Solution{
        static int searchInSorted(int arr[], int N, int K)
        {
            int s  = 0, e = N - 1;
            int mid = (s + e) / 2;
            while(s <= e) {
                if(arr[mid] == K) {
                    return 1;
                }else if(arr[mid] > K) {
                    e--;
                }else {
                    s++;
                }
             mid = (e + s) / 2;   
            }
            return -1;
            
        }
    }
}
