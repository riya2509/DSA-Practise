// Kadane's Algorithm

// Given an array arr of N integers, find the contiguous sub-array with the
// maximum sum.
// Example:
// Input:
// N = 5
// Arr[ ] = {1, 2, 3, -2, 5}
// Output:
// 9

public class Main2 {
    public static void main(String[] args) {
        int[] a = { -2, -3, 4, -1, -3 };
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
    }

    static int maxSubArraySum(int a[]) {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < size; i++) {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}