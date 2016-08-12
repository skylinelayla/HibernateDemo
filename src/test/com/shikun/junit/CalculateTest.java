package test.com.shikun.junit; 

import com.shikun.junit.Calculate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.*;

/** 
* Calculate Tester. 
*
*/ 
public class CalculateTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(int a, int b) 
* 
*/ 
@Test
public void testAdd() throws Exception {
//TODO: Test goes here...
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
@Test
public void testDivide() throws Exception { 
//TODO: Test goes here...
    assertEquals(1, new Calculate().divide(3,3));
}

} 
