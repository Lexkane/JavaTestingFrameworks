/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static testingng.TestingNG.add;
import static testingng.TestingNG.sub;

/**
 *
 * @author 111
 */
public class TestingNGMath {
    
    public TestingNGMath() {
    }
    
    @Test (groups={"A","B"})
    public void addTest(){
        int a=5,b=7,s=12;
        int res=add(a,b);
        assertEquals(res,s,"bad add");
    }
    @Test (groups={"C"})
    public void subTest(){
        int a=5,b=7,s=-2;
        int res=sub(a,b);
        assertEquals(res,s,"bad sub");
    }
    

    @BeforeClass
    public static void setUpClass() throws Exception {
    }
    
}
