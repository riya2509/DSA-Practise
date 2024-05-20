package InterviewQues;

import java.util.HashMap;

// Ques - Find if there is a similar number in two arrays
// Approach 1 Inefficient - Using two arrays and nested for loop to iterate each element , TC=O(n^2)
// Approach 2 Efficient - Using hash Map , TC = O(n)

// Note: HashMap allows one null key and multiple null values whereas Hashtable doesn't allow any null key or value

public class Main {
    // public static boolean itemInCommon(int[] array1, int[] array2) {
    // // This for loop returns the value at each index
    // for (int i : array1) {
    // for (int j : array2) {
    // if (i == j)
    // return true;

    // }
    // }
    // return false;
    // }
    public static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();
        for (int i : array1) {
            myHashMap.put(i, true);
        }
        for (int j : array2) {
            if (myHashMap.get(j) != null)
                return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 7, 8, 9, 4, 5 };

        System.out.println(itemInCommon(array1, array2));

    }
}
