package com.yang.array;

public class Solution12 {
    public int missingNumber(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
           if (nums[i] != i) {
               return i;
           }
        }

        return nums.length;
    }

    public int missingNumber2(int[] nums) {

      int left = 0;
      int right = nums.length;

      while(left <= right) {
          int mid = ( left + right )/2;
          if (nums[mid] == mid) {
              left = mid + 1;
          }else {
              right = mid - 1;
          }
      }
      return left;
    }
}
