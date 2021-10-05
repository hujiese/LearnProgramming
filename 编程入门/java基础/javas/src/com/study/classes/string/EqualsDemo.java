package com.study.classes.string;

public class EqualsDemo {
    public static void main(String args[]) {
        String Str1 = new String("hello");
        String Str2 = Str1;
        String Str3 = new String("hell");
        boolean retVal;

        retVal = Str1.equals( Str2 );
        System.out.println("返回值 = " + retVal ); // 返回值 = true

        retVal = Str1.equals( Str3 );
        System.out.println("返回值 = " + retVal ); // 返回值 = false
    }
}
