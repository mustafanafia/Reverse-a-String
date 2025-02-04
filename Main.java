// Java Program to Reverse a String
// Using for loop
import java.io.*;
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {

        String s = "ABC";

        char[] charArr = s.toCharArray();

        for(int i=charArr.length-1; i >= 0; i --){
            System.out.print(charArr[i]);
        }

        //Another way to do it

        String s = "ABC";
        StringBuilder res = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            res.insert(0, ch);
        }
        System.out.println(res);
    }
}