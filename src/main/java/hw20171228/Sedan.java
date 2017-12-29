/**
 * Project Name:dt59homework
 * File Name:Sedan.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午3:59:10
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午3:59:10 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
class Sedan extends Car {
    String name = "雷斯";

    String color = "钛银";

    public void run() {
        System.out.println("我会跑");
    }

    Sedan() {
        System.out.println("我是一辆车，" + "我的名字是" + name + "我的品牌是" + barand + "我的颜色是 " + color + "我有" + wheel + "个轮");
    }
}
