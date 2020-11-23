package com.liko.array;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int front = 0;
        int rear = 1;

        while(front < nums.length) {
            if (nums[front]+nums[rear] != target) {
                rear++;
            }else {
                break;
            }
            if (rear == nums.length) {
                front++;
                rear = front+1;
            }
        }

        return new int[]{front,rear};
    }
}
