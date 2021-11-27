package com.yl.dockerdemo.core.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author: zhangfh@yealink.com
 * @date: 2021/11/25 13:59
 */
class ContextTest {

    @Test
    void test() {
        Context context = new Context(new OperationAdd());
        int sum = context.executeStrategy(3, 5);
        assertEquals(8, sum);
    }

    @Test
    void test1() {
        Context context = new Context(new OperationSubtract());
        int sub = context.executeStrategy(3, 5);
        assertEquals(-2, sub);
    }

    @Test
    void test2() {
        Strategy strategy = StrategyFactory.getBean(OperationAdd.class.getName());
        assertEquals(4, strategy.doOperation(1, 3));
    }

    @Test
    void test3() {
        Strategy strategy = StrategyFactory.getBean(StrategyEnum.ADD.getClassName());
        assertEquals( 3, strategy.doOperation(1, 2));
    }


}