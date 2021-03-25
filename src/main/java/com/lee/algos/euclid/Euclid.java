package com.lee.algos.euclid;

public class Euclid {


    public int gcd(int number, int divisor) {
        int remaining = (number % divisor);

        if (remaining != 0) {
            return gcd(divisor, remaining);

        } else {
            return divisor;
        }

    }

    /**
     * 22/6 = 3 rest is 4
     * 6/4 = 1 rest is 2
     * 4/2 = 2 rest of 0
     *
     *
     * @param number
     * @param divisor
     * @return
     */
    public int gcd2(int number, int divisor) {
        while (divisor != 0) {
            int temp = divisor;
            divisor = (number % divisor);
            number = temp;
        }

        return number;
    }

}
