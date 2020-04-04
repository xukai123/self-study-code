package com.wust.common;

import com.wust.common.utils.MathUtils;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilsTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("before test");
    }

    @Test
    public void factorial() throws Exception {
        assertEquals(2, new MathUtils().factorial(2));
        System.out.println("end test");
    }
}