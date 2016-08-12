package com.shikun.junit;

;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by SHIKUN on 2016/8/12.
 */
@RunWith(Parameterized.class)
public class ParameterTest {
    int expected=0;
    int input1=0;
    int input2=0;

    @Parameterized.Parameters
    public static Collection<Object[]> t(){
        return Arrays.asList(new Object[][]{
                {3, 1, 2},{4,2,2},{5,3,2}
        });
    }

    public ParameterTest(int expected, int a, int b) {
        this.expected = expected;
        this.input1 = a;
        this.input2 = b;
    }

    @Test
    public void testAdd() {
        assertEquals(expected, new Calculate().add(input1, input2));
    }



}
