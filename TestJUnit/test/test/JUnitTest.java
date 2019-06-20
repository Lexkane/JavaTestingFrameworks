
package test;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import testjunit.TestJUnit;


@RunWith(Parameterized.class)
public class JUnitTest {
    
    int  a,b,expResult;
    
    @Rule
    public TestRule timeout= new Timeout(1000);
    
    
    
    @Parameterized.Parameters
    public static Collection number(){
        return Arrays.asList(new Object [][]{{1,2,3},
            {2,9,11},{3,3,6}});
    }
    
    //public JUnitTest() {
    //}
   
    public JUnitTest( int a,int b, int expResult){
        this.a=a;
        this.b=b;
        this.expResult=expResult;
    }
    
    @Before
    public void setUp(){
        
    }
    
    @After
    public void tearDown(){
        
    }
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Test(timeout=1)
    public void testAdd() throws InterruptedException {
        System.out.println("add");
        //int a=0;
        //int b=0;
        //int expResult=0;
        int result= TestJUnit.adder(a,b);
        assertEquals(expResult,result);
       // fail("The test add has failed");
    }
    
      @Ignore
      @Test(timeout=1)
    public void testDiv(){
        System.out.println("div");
        //int a=1;
        //int b=1;
        //int expResult=1;
        int result= TestJUnit.div(a,b);
        assertEquals(expResult,result);
        //fail("The test add has failed");
    }
    
    @Ignore
    @Test(expected=ArithmeticException.class)
    public void testFailDiv(){
         System.out.println("div");
        //int a=0;
        //int b=0;
        //int expResult=0;
        int result= TestJUnit.div(0,0);
        assertEquals(expResult,result);
       }

 
}
