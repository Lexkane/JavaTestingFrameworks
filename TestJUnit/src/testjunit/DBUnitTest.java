/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjunit;

/**
 *
 * @author 111
 */
public class DBUnitTest {
    
    public static void main(String [] args) throws java.sql.SQLException{
        new MyBLogic().editItem(8,"abc", new DBase());
    }
   }
