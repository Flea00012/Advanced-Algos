package com.lee.algos.euclid;


/**
 * brute force algo
 * <p>
 * it will search for a pattern in an
 * array and if the patter found it will return
 * the index of the array where the first letter
 * of the patter was found
 * <p>
 * If no match if found it will return -1
 */
public class BruteForce {

    /**
     * this method searches for the pattern into the array
     * and returns the index of the first char that matches
     * <p>
     * array=abcdef
     * pattern = def -> 4
     *
     * @param array
     * @param pattern
     * @return
     */
    public int firstMatch(char[] array, char[] pattern) {
        for (int a = 0; a <= array.length - pattern.length; a++) {
            for (int p = 0; p <= pattern.length; p++) {
                if (array[a + p] != pattern[p]) break;
                if (p == pattern.length - 1) return a;
            }
        }

        //if no match
        return -1;
    }
}
