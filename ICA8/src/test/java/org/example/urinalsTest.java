package org.example;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.descriptor.UriSource;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {
    @Test
    public void test3GoodString() {
        System.out.println("======Bhavani Lenkala == TEST THREE EXECUTED =======");
        urinals uobj=new urinals();
        assertEquals(true,uobj.goodString("1001"));
    }
    @Test
    public void test2GoodString() {
      System.out.println("======Bhavani Lenkala == TEST TWO EXECUTED =======");
      urinals uobj=new urinals();
      assertEquals(true,uobj.goodString("10001"));
    }

}