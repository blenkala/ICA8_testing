package org.example;

import java.io.*;
import java.util.Scanner;

public class urinals {
    public static void main(String[] args) throws IOException {
        String str[]= getString();
        if(str[0].equals("1")) {
            boolean res = goodString(str[1]);
            if (res == false) {
                System.out.println("invalid string, printing -1");
            } else {
                int y = urinalscount(str[1]);
                System.out.println(y);
            }
        }
        else{
        String[] NameOftheFile = new String[100];
        for(int i=0;i<100;i++){
            if(i==0){
                NameOftheFile[0] = "rule.txt";
            }
            else{
                NameOftheFile[i] = "rule"+ i +".txt";
            }
        }
        FileReader fssd = new FileReader("src/main/java/org/example/urinals.dat");
        BufferedReader fb = new BufferedReader(fssd);
        String PathOftheFile = "src/main/java/org/example/";
        for(int i=0;i<100;i++){
            File ffr = new File(PathOftheFile+NameOftheFile[i]);
            if(ffr.exists() && !ffr.isDirectory()) {
                continue;
            }
            else{
                PathOftheFile = PathOftheFile + NameOftheFile[i];
                break;
            }
        }
        File myObj = new File(PathOftheFile);
        myObj.createNewFile();
        BufferedWriter bqob = new BufferedWriter(new FileWriter(PathOftheFile));

        String strr = fb.readLine();

        while (strr != null) {
            if (!strr.equals("-1")) {
                if (goodString(strr)) {
                    strr= String.valueOf(urinalscount(strr));
                    bqob.write(strr);
                    bqob.newLine();
                } else {
                    bqob.write("-1");
                    bqob.newLine();
                }
            } else System.exit(0);
            strr = fb.readLine();
        }
        bqob.close();
    }}


    public static String[] getString() throws IOException {
        String[] sarr=new String[2];
        System.out.println("How would you like to give input: 1 for scanner 2 for file");
        Scanner sc=new Scanner(System.in);
        String inputVal=sc.next();
        if(inputVal.equals(1)) {
            System.out.println("Enter the string you want to test:");
            String str = sc.next();
            sarr[0]=inputVal;
            sarr[1]=str;
            return sarr;
        }
        else{
            File file = new File("src/main/java/org/example/urinals.dat");
            String val="";
            BufferedReader br
                    = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null)
                val=st;
            br.close();
            sarr[0]=inputVal;
            sarr[1]=val;
            return sarr;
        }
    }
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
                    else if(i+1< stringFromInput.length() && stringFromInput.charAt(i+1)=='1' )
                    {
                        arr[i]=arr[i-1];
                    }
                    else
                    {
                        arr[i]=Math.max(arr[i],1+arr[i-2]);
                    }
                }
            }
        }
        int ss=arr[stringFromInput.length()-1];
        return ss;
    }



}