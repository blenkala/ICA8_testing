package org.example;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.descriptor.UriSource;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {
    @Test
    public void test2GoodString() {
        System.out.println("======Bhavani Lenkala == TEST TWO EXECUTED =======");
        urinals uobj=new urinals();
        assertEquals(true,uobj.goodString("10001"));
    }
    @Test
    public void test3GoodString() {
        System.out.println("======Bhavani Lenkala == TEST THREE EXECUTED =======");
        urinals uobj=new urinals();
        assertEquals(true,uobj.goodString("1001"));
    }

    @Test
    public void test4GoodString() {
        System.out.println("======Bhavani Lenkala == TEST FOUR EXECUTED =======");
        urinals uobj=new urinals();
        assertEquals(false,uobj.goodString("011"));
    }

    @Test
    public void test5GoodString() {
        System.out.println("======Bhavani Lenkala == TEST FIVE EXECUTED =======");
        urinals uobj=new urinals();
        assertEquals(1,uobj.urinalscount("10001"));
    }

    @Test
    public void test6GoodString() {
        System.out.println("======Bhavani Lenkala == TEST SIX EXECUTED =======");
        urinals uobj=new urinals();
        assertEquals(0,uobj.urinalscount("1001"));
    }
    @Test
    public void test7GoodString() {
        System.out.println("======Bhavani Lenkala == TEST SEVEN EXECUTED =======");
        urinals uobj=new urinals();
        assertEquals(2,uobj.urinalscount("0000"));
    }

    @Test
    public void test8GoodString() {
        System.out.println("======Bhavani Lenkala == TEST EIGHT EXECUTED =======");
        urinals uobj=new urinals();
        assertEquals(3,uobj.urinalscount("00000"));
    }

    @Test
    public void test9GoodString() {
        System.out.println("======Bhavani Lenkala == TEST NINE EXECUTED =======");
        urinals uobj=new urinals();
        assertEquals(1,uobj.urinalscount("01000"));
    }
}