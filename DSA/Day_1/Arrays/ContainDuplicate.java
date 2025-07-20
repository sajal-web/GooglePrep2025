package GooglePrep2025.DSA.Day_1.Arrays;

import java.util.HashSet;

/*
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.
 */


public class ContainDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(isContainDuplicate(nums));
        System.out.println(optimized(nums));
    }
    // Brut force soluation
    static boolean isContainDuplicate(int arr[]){
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    // Optimize soluation
    static boolean optimized(int arr[]){
        HashSet<Integer> isSeen = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            if (isSeen.contains(arr[i])) {
                return true;
            }
            isSeen.add(arr[i]);
        }
        return false;
    }

}
