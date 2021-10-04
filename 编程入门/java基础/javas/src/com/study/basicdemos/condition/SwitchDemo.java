package com.study.basicdemos.condition;

public class SwitchDemo {
    public static void main(String[] args) {
        /* 局部变量定义 */
        char grade = 'B';

        switch(grade) {
            case 'A' :
                System.out.println("很棒！" );
                break;
            case 'B' :
            case 'C' :
                System.out.println("做得好" );
                break;
            case 'D' :
                System.out.println("您通过了" );
                break;
            case 'F' :
                System.out.println("最好再试一下" );
                break;
            default :
                System.out.println("无效的成绩" );
        }
    }
}
