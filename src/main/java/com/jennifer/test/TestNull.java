package com.jennifer.test;

import org.testng.annotations.Test;

/**
 * Created by IntelliJ IDEA.
 * User: jennifer.huang
 * Date: 2/10/2017
 */
public class TestNull {

    @Test
    public void testNull(){
        Boolean testB = null;
        if(testB!=null && testB==true){
            System.out.println("true");
        }
        if(null!=testB && testB==true){
            System.out.println("true");
        }

//        if(testB==true){
//            System.out.println(true);
//        }

//        if(testB==true && testB!=null ){
//            System.out.println(true);
//        }
    }
}
