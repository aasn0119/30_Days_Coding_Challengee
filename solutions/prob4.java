
//  The most optimal Solution with T.C -> O(n) and S.C -> O(1)

class Solution {
    int remove_duplicate(int A[],int N){
        int i = 0;
        for(int j = 1; j < N; j++) {
            if(A[j] != A[i]) {
                A[i + 1] = A[j];
                i++;
            }
        }
        return (i + 1);
    }
}