package org.example;

import java.util.Scanner;

public class urinals {
    public static void main(String[] args) {
        String str= getString();
        boolean x=goodString(str);
        if(x==false)
        {
            System.out.println("invalid string, printing -1");
        }
        else {
            int y=urinalscount(str);
        }

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

    public static int urinalscount(String str)
    {
        int[]a=new int[str.length()];

        return 0;
    }
    public static String getString(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();
        return str;
    }

}