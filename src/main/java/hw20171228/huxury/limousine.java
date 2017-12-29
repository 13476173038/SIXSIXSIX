/**
 * Project Name:dt59homework
 * File Name:limousine.java
 * Package Name:hw20171228.huxury
 * Date:2017年12月29日下午8:38:00
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228.huxury;

import dt59homework.Car;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午8:38:00 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class limousine extends Car {
    private String barand;

    private int wheel;

    public void summary() {

        System.out.println("我是豪车，" + "我的品牌是" + barand + "我有" + wheel + "个轮");
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
