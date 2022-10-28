package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class urinals {
    public static void main(String[] args) throws FileNotFoundException {

    }
    public static boolean goodString(String str){
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='0' || str.charAt(i)=='1')
            {
                if(i>0 && str.charAt(i)=='1' && str.charAt(i-1)=='1')
                {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        return true;
    }
}