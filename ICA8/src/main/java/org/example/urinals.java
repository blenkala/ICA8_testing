package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class urinals {

    public static boolean goodString(String inputString){
        boolean res=true;
        for(int i=0;i<inputString.length();i++)
        {
            if(inputString.charAt(i)=='1' || inputString.charAt(i)=='0')
            {
                if(i>0)
                    if(inputString.charAt(i)=='1' && inputString.charAt(i-1)=='1')
                 res=false;
            }
            else {
                res= false;
            }
        }
   return res;
    }

    public static int urinalscount(String stringFromInput)
    {
        int[]arr=new int[stringFromInput.length()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=0;
        }
        for(int i=0;i<stringFromInput.length();i++)
        {
            if(i==0)
            {
                if(stringFromInput.charAt(i)=='0')
                {
                    if(i+1<stringFromInput.length()) {
                        if (stringFromInput.charAt(i + 1) == '1' && i+1>0) {
                            arr[i] = 0;
                        } else {
                            arr[i] = 1;
                        }
                    }
                }
                else {
                    arr[i]=0;
                }
            }
            else if(i==1)
            {
                if(stringFromInput.charAt(i)=='1' && i>0) {
                    arr[i] = arr[i - 1];
                }
                else
                {
                    if(stringFromInput.charAt(i-1)=='1' && i>0)
                    {
                        arr[i]=arr[i-1];
                    }
                    else if(i+1<stringFromInput.length() && stringFromInput.charAt(i+1)=='1')
                    {
                        arr[i]=arr[i-1];
                    }
                    else
                    {
                        arr[i]=1;
                    }
                }
            }
            else {
                arr[i]=arr[i-1];
                if(stringFromInput.charAt(i)=='1') {
                    arr[i] = arr[i - 1];
                }
                else
                {
                    if(stringFromInput.charAt(i-1)=='1')
                    {
                        arr[i]=arr[i-1];
                    }
                    else if(stringFromInput.charAt(i+1)=='1'&& i+1< stringFromInput.length() )
                    {
                        arr[i]=arr[i-1];
                    }
                    else
                    {   if(arr[i]> 1+arr[i+2])
                        arr[i]=arr[i];
                        else
                        arr[i]=arr[i-2]+1;
                        //arr[i]=Math.max(arr[i],1+arr[i-2]);
                    }
                }
            }
        }
        int ss=arr[stringFromInput.length()-1];
        return ss;
    }



}