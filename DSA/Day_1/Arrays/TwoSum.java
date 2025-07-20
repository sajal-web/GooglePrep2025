package GooglePrep2025.DSA.Day_1.Arrays;

import java.util.Arrays;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * 
 * Example
 * Input : [2,7,11,15], target = 9
 * Output : [0.1]
 * Explanation: Because nums[0] + nums[1] = 9, we 
 * return [0,1].
 * 
 */

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {12,89,11,15};
        Arrays.sort(arr);
        int target = 3;

       int[] result = twoPointerApproach(arr, target);
       printIndex(result);
    }
    static int[] findTwoSum(int arr[], int target) {
        for(int i =0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++) {
                if (arr[i] + arr[j] == target) {
                 int[]  result = {i,j};
                    return result;
                }
            }
        }
        return null;
    }
    static int[] twoPointerApproach(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                int[] result = {start, end};
                return result;
            } 
            else if (sum > target) {
                end --;
            } else {
                start ++;
            }
        }
        return null;
    }
    static void printIndex(int arr[]){
        if(arr == null){
            System.out.println("Sorry no index found!");
        } else {
            for(int i =0;i<arr.length;i++){
                System.out.print(arr[i]+", ");
            } 
        }
    }
}
