package com.jennifer.variable;

/**
 * Created by IntelliJ IDEA.
 * User: jennifer.huang
 * Date: 2/9/2017
 */
public class VariantTest { //方法區

    public static int staticVar=1; //方法區
    public int instanceVar=1;  //堆區

    public VariantTest() {
        staticVar++;
        instanceVar++;
        System.out.println("staticVar = "+staticVar+"  instanceVar = "+instanceVar);
    }

    public void methodVariableTest(){
        int methodVar = 1;  //棧區
        System.out.println("methodVar = "+methodVar++);
        System.out.println();
    }


    @org.testng.annotations.Test
    public void test(){
        VariantTest variantTest1 = new VariantTest();
        variantTest1.methodVariableTest();
        VariantTest variantTest2 = new VariantTest();
        variantTest2.methodVariableTest();

    }
}
