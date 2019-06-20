/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjunit;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 111
 */
public class MyBLogicTest {
    
    
    Mockery cnt = new Mockery();
    
    public MyBLogicTest() {
    }
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    

    @Test
    public void testEditItem() throws Exception {
       // System.out.println("editItem");
        int id = 0;
        String newName = "hello";
        DBInt db = cnt.mock(DBInt.class);
        
        cnt.checking(new Expectations(){{
            oneOf (db).find(id);
            oneOf(db).save(id, newName); will(returnValue(1));
        }});
        
        MyBLogic instance = new MyBLogic();
        int expResult = 1;
        int result = instance.editItem(id, newName, db);
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }
    
}
