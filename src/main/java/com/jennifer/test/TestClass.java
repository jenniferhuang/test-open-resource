package com.jennifer.test;

import com.sun.xml.internal.messaging.saaj.util.Base64;

import java.io.UnsupportedEncodingException;

/**
 * Created by IntelliJ IDEA.
 * User: jennifer.huang
 * Date: 12/27/2016
 */
public class TestClass {

    public static void main(String[] args) throws UnsupportedEncodingException {
        Organization organization = new Organization();


        String s="WjA2eUpuYzhUTU85MkRWY1VvaHJGZzpXUnlzQ2hnZVM0R3pndGozWi1FRkFRdDFkQjhVcEdTWGUtY0tPOWVkdEhxdw";  //Internal APP, redirect lrw, PAS return access for lrw application
        System.out.println(Base64.base64Decode(s));  //Z06yJnc8TMO92DVcUohrFg:WRysChgeS4Gzgtj3Z-EFAQt1dB8UpGSXe-cKO9edtHqw

        String dpw_key ="ZHFsT3M5R0hRRXl5Yjl6QktPcmVUdzo0dHhMNndCZlREQ0RuZ3J2SmQ0TVVBUmk2NmpEWW9UbFN3TG9qUEVfMVViUQ";  //Dpw app
        System.out.println(Base64.base64Decode(dpw_key));  //dqlOs9GHQEyyb9zBKOreTw:4txL6wBfTDCDngrvJd4MUARi66jDYoTlSwLojPE_1UbQ



        String d3key="SjYmlnCwR6-MzXn19snORg";
        String d3keySecret="9ZAwJ4sQRVSxU_VXgrr3WAb51SK1GYQVWIKL1pSsrLAg";

//

        String d3_ta="";



        //JWT  - JSON Web Token
        String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJEYXNoIiwidWlkIjoiMWo0NTBiMzRqYWZqZ2k3Y3JxOGVuNmFxcDAiLCJzdnAiOnsiNzI3IjoiMiJ9LCJzdWIiOiIxNDYxMjMwMDMiLCJleHQiOiIxNDYxMjMwMDMifQ.SbZipAU9LWsOH-M_bHO2-DEX2-BQJlCiaqcRQLF9Dsk";
        System.out.println(Base64.base64Decode(token));



    }
}
