package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class urinals {
    public static void main(String[] args) throws FileNotFoundException {

    }
    public static boolean goodString(String inputString){
        for(int i=0;i<inputString.length();i++)
        {
            if(inputString.charAt(i)!='0' || inputString.charAt(i)!='1')
            { return false;
            }
            else {
                if(i>0)
                    if(inputString.charAt(i)=='1' && inputString.charAt(i-1)=='1')
                        return false;
            }
        }
        return true;
    }
}