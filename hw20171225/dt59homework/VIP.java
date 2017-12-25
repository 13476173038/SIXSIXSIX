/**
 * Project Name:dt59homework
 * File Name:Vip.java
 * Package Name:dt59homework
 * Date:2017年12月25日下午7:01:06
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

import java.util.Scanner;

/**
 * Description: <br/>
 * Date: 2017年12月25日 下午7:01:06 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */

public class VIP {

    double Money(int x, double y) {

        return 0.95 * y;
    }

    double Money2(int x, double y) {

        return 0.9 * y;
    }

    double Money3(int x, double y) {

        return 0.85 * y;
    }

    double Money4(int x, double y) {

        return 0.8 * y;
    }

    double Money5(int x, double y) {

        return 0.75 * y;
    }

    public static void main(String[] args) {
        VIP vip;
        vip = new VIP();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入消费金额");
        double y = scanner.nextInt();
        System.out.println("白银会员请输入1");
        System.out.println("黄金会员请输入2");
        System.out.println("铂金会员请输入3");
        System.out.println("钻石会员请输入4");
        System.out.println("至尊会员请输入5");
        int x = scanner.nextInt();
        switch (x = 5) {
        case 1:
            System.out.println("你共花费" + vip.Money(x, y));
            break;
        case 2:
            System.out.println("你共花费" + vip.Money2(x, y));
            break;
        case 3:
            System.out.println("你共花费" + vip.Money3(x, y));
            break;
        case 4:
            System.out.println("你共花费" + vip.Money4(x, y));
            break;
        case 5:
            System.out.println("你共花费" + vip.Money5(x, y));
        }

    }

}
