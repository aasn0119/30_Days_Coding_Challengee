import java.util.*;

public class prob1 {

    // Function to find largest Element in the array..!
    // (Brute force approach)
    // Time Complexity -> O(nlogn) and Space Complexity -> O(1)

    public static int largeEle(ArrayList<Integer> list) {
        // Sort the array
        int n = list.size() - 1;
        Collections.sort(list);
        return list.get(n);
    }

    // Optimal Approach is to use Linear search....!
    // Time Complexity -> O(n) and Space Complexity -> O(1)

    public static int largeEle2(ArrayList<Integer> list) {
        // Sort the array
        int mx = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++) {
            if(mx < list.get(i)) {
                mx = list.get(i);
            }
        }
        return mx;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 8, 7, 56, 80 };
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i, arr[i]);
        }
        System.out.println(largeEle(list));
        System.out.println(largeEle2(list));
    }
}
