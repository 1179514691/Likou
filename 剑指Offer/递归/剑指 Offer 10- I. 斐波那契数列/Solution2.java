package com.yang.Recursion;

public class Solution2 {
    public int fib(int n) {

        long one = 1;
        long two = 1;

        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }


        while(n > 1) {
            long temp = two % 1000000007;
            two = (one + two) % 1000000007;
            one = temp % 1000000007;
            n--;
        }

        return (int)one % 1000000007;
    }


}
