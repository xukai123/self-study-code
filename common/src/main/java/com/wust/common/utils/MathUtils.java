package com.wust.common.utils;

/**
 * @Description TODO
 * @Author xukai
 * @Date 2020/4/3 19:36
 * @Version 1.0
 **/
public class MathUtils {

    /**
     * @Date 2020/4/3 20:04
     * @Description 获取一个数字的阶乘
     **/
    public int factorial(int num) {
        if (num < 0) {
            System.out.println("params is invalidate!");
            return -1;
        } else if (num <= 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

}
