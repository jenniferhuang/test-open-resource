package com.jennifer.test;

import org.testng.annotations.Test;

/**
 * Created by IntelliJ IDEA.
 * User: jennifer.huang
 * Date: 2/10/2017
 */
public class TestXUNHUAN {

    @Test
    public void test(){
        int i=6;
        Boolean a = false;
        while(i>0){
            System.out.println("i = "+i);
            i--;
            if(a) break;
            System.out.println("i = "+i);
            a = true;
        }
    }
}
