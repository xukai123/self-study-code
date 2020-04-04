package com.wust.common.utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilsTest {

    @Before
    public void setUp(){
        System.out.println("test begin...................");
    }

    @After
    public void shutDown(){
        System.out.println("test end.....................");
    }

    @Test
    public void factorial() {
        assertEquals(2, new MathUtils().factorial(2));
        System.out.println("test success!!!");
    }
}