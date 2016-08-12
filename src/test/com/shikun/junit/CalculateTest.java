package com.shikun.junit;
import com.shikun.junit.Calculate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.*;
/*


@RunWith 更改测试运行器
 */

/** 
* Calculate Tester. 
*
*/ 
public class CalculateTest { 

@Before//方法运行前执行
public void before() throws Exception {
    //System.out.println("before");
} 

@After//方法运行后执行
public void after() throws Exception {
   // System.out.println("after");
} 

/** 
* 
* Method: add(int a, int b) 
* 
*/ 
@Test//测试方法
public void testAdd() throws Exception {
//TODO: Test goes here...
    //System.out.println("this is test1");
     assertEquals(6, new Calculate().add(3, 3));

} 

/** 
* 
* Method: minus(int a, int b) 
* 
*/ 
@Test
public void testMinus() throws Exception { 
//TODO: Test goes here...
    assertEquals(0, new Calculate().minus(3, 3));
} 

/** 
* 
* Method: multiply(int a, int b) 
* 
*/ 
@Test
public void testMultiply() throws Exception { 
//TODO: Test goes here...
    assertEquals(9, new Calculate().multiply(3, 3));
} 

/** 
* 
* Method: divide(int a, int b) 
* 
*/ 
@Test(expected = ArithmeticException.class)//捕获异常。不报错
public void testDivide() throws Exception { 
//TODO: Test goes here...
    assertEquals(3, new Calculate().divide(3,0));
}

} 
