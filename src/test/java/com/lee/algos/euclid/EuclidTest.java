package com.lee.algos.euclid;


import org.junit.Assert;
import org.junit.Test;


public class EuclidTest {


    @Test
    public void gcdTest() {
        Euclid e = new Euclid();

        Assert.assertEquals(2, e.gcd(10, 2));
        Assert.assertEquals(2, e.gcd(22, 6));
    }

    @Test
    public void gcd2Test() {
        Euclid e = new Euclid();

        Assert.assertEquals(2, e.gcd2(10, 2));
        Assert.assertEquals(2, e.gcd2(22, 6));
    }
}