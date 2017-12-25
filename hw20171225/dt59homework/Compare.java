/**
 * Project Name:dt59homework
 * File Name:compare.java
 * Package Name:dt59homework
 * Date:2017年12月25日下午5:00:24
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午5:00:24 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
/*
 * public class Compare {
 * 
 * int num() { int x = 0; return x; }
 * 
 * int num2() { int y = 0; return y; }
 * 
 * public static void main(String[] args) { Compare compare; compare = new
 * Compare(); if (compare.num() > compare.num2()) {
 * System.out.println("两个数中较大的一个为" + compare.num()); } else {
 * System.out.println("两个数中较大的一个为" + compare.num2()); }
 * 
 * }
 * 
 * }
 */
public class Compare {

    int num(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    public static void main(String[] args) {
        Compare compare;
        compare = new Compare();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入2个数");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("其中大的为" + compare.num(x, y));
    }

}
