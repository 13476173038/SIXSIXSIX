/**
 * Project Name:dt59homework
 * File Name:Car.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午3:50:04
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午3:50:04 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public abstract class Car {
    String barand;

    int wheel;

    public void summary() {
        System.out.println("我是一辆车，" + "我的品牌是" + barand + "我有" + wheel + "个轮");
    }

    public Car() {
        System.out.println("我是一辆车，" + "我的品牌是" + barand + "我有" + wheel + "个轮");
    }

    public String getBarand() {
        return barand;
    }

    public void setBarand(String barand) {
        this.barand = barand;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

}
