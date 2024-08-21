// BRUT Force Approach - 
// 1. Perform a nested for loop , for each element 'x' 
// 2. Another for loop to find 'y' for which 'x+y' = target
// TC = O(n^2)

// Optimized Solution - 
// 1. As we want to know the indices , we should keep track of element and index. For that create a HashMap
// 2. iterate through the array
// 3. If map contains ' target - nums[i]' return (i, myHashMap.get(target - nums[i]))
// 4. else put nums[i] and i into map 
// 5. lastly return an empty array or throw exception.
// TC and SC = O(n) , where n is the length of the input array 

package InterviewQues;

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (myHashMap.containsKey(target - nums[i])) {
                return new int[] { i, myHashMap.get(target - nums[i]) };
            }
            myHashMap.put(nums[i], i);
            // This line adds the current number (nums[i]) as the key and its index (i) as
            // the value to
            // the HashMap (myHashMap). The key-value pair is stored as (number, index).
            // Initially myHashMap is empty.
        }
        // return new int[0];
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String args[]) {
        int[] nums = { 1, 2, 3, 5, 6 };
        int target = 8;

        // when we try to print an array directly using System.out.println(),
        // it prints the object's memory reference instead of its contents, which
        // appears as gibberish.
        // To fix this, you should use Arrays.toString() method from the
        // java.util.Arrays class,
        // which converts the array into a readable string format.

        // System.out.println(twoSum(nums, target));

        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));

    }
}
