package com.example.calculator;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    @Test
    public void test_양수덧셈() {
        Calculator calc = new Calculator();
        int result = calc.add(5,4);

       assertEquals("add 함수의 결과는 0이어야 합니다.", 9, result);
    }

    @Test
    public void test_음수덧셈() {
        Calculator calc = new Calculator();
        int result = calc.add(-5,-4);
        assertEquals(-9, result);

    }


    @Test
    public void test_덧셈2() {
        Calculator calc = new Calculator();
        int result = calc.add(5,4);

        assertNotEquals(0 , result);
    }

    @Test
    public void test_정수나눗셈() {
        Calculator calc = new Calculator();
        int result = calc.devide(10,5);
        assertEquals(2 , result);
    }

    @Test
    public void test_실수나눗셈() {
        Calculator calc = new Calculator();
        double result = calc.devide(10.0,4.0);
        assertEquals(2.5 , result);
    }

    @Test(expected = ArithmeticException.class)
    public void test_0으로나누기() {
        Calculator calc = new Calculator();
        int result = calc.devide(10,0);
        assertEquals(0 , result);
    }


    @Test
    public void 양수뺄셈() {
        Calculator calc = new Calculator();
        int result = calc.subtract(5,4);
        assertEquals(1 , result);
    }

    @Test
    public void 양수곱셈() {
        Calculator calc = new Calculator();
        int result = calc.multiply(5,4);
        assertEquals(20, result);
    }

}