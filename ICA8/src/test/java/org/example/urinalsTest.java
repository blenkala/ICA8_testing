package org.example;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.descriptor.UriSource;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @Test
    public void test1GoodString() {
      System.out.println("======Bhavani Lenkala == TEST TWO EXECUTED =======");
      urinals uobj=new urinals();
      assertEquals(true,uobj.goodString("10001"));
    }

}