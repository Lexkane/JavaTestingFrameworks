/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static testingng.TestingNG.add;
import static testingng.TestingNG.sub;

/**
 *
 * @author 111
 */
public class TestingNGJava {
    
    public TestingNGJava() {
    }
    
    @DataProvider(name="dp")
    public static Object[][] testData(){
        return new Object[][]{{2,3,5},{-6,4,-2}};
    }
    
    //@Test(enabled=false) 
    @Test(groups=("A"))
    @Parameters(value ={"a","b","s"})
    public void addTestwork(int a,int b,int s){
        //int a=5,b=7,s=12;
        int res=add(a,b);
        assertEquals(res,s,"bad add in work");
    }
    @Test (groups=("B"))
    public void subTestwork(){
        int a=5,b=7,s=-2 ;
        int res=sub(a,b);
        assertEquals(res,s,"bad sub in work");
    }
    

    

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    
}
