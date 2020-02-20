
package calc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTest {
    
    public CalcTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception  {
    }
    
    @After
    public void tearDown()throws Exception {
    }

    /**
     * Test of add method, of class Calc.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int x = 8;
        int y = 2;
        Calc instance = new Calc();
        int expResult = 10;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
    }
    @Test
public void testAdd2() {
        System.out.println("add");
        int x = 100;
        int y = -60;
        Calc instance = new Calc();
        int expResult = 40;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
    }
@Test
public void testAdd3() {
        System.out.println("add");
        int x = -5;
        int y = -2;
        Calc instance = new Calc();
        int expResult = -7;
        int result = instance.add(x, y);
        assertEquals(expResult, result);
    }
    /**
     * Test of division method, of class Calc.
     */
    @Test(expected=RuntimeException.class)
    public void testDivision() {
        System.out.println("divide");
        int a = 5;
        int b = 0;
        Calc instance = new Calc();
        float result = instance.divide(a, b);
    }
@Test
    public void testDivision2() {
        System.out.println("divide");
        int a = 0;
        int b = -2;
        Calc instance = new Calc();
        float expResult=0.0F;
        float result = instance.divide(a, b);
        assertEquals(expResult, result,0.0);}
@Test
    public void testDivision3() {
        System.out.println("divide");
        int a = 100;
        int b = 3;
        Calc instance = new Calc();
        float expResult=33.3F;
        float result = instance.divide(a, b);
        assertEquals(expResult, result,0.1);}
    @Test
    public void testDivision4() {
        System.out.println("divide");
        int a = 7;
        int b = 2;
        Calc instance = new Calc();
        float expResult=3.5F;
        float result = instance.divide(a, b);
        assertEquals(expResult, result,0.1);}
    @Test
    public void testDivision5() {
        System.out.println("divide");
        int a = 5;
        int b = -2;
        Calc instance = new Calc();
        float expResult=-2.5F;
        float result = instance.divide(a, b);
        assertEquals(expResult, result,0.1);}
}
