package com.nacl;

import org.junit.Test;

/**
 * @author nacll
 * @date 2019/6/21.
 */
public class TestDemo {

    /**
     *
     * 用位运算交换两个数
     * */
    @Test
    public void test1(){
        int x = 124;
        int y = 234;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("x=" + x);
        System.out.println("y=" + y);

    }
}
