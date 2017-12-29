/**
 * Project Name:dt59homework
 * File Name:Man.java
 * Package Name:hw20171228
 * Date:2017年12月29日下午9:18:53
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171228;

/**
 * Description: <br/>
 * Date: 2017年12月29日 下午9:18:53 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class Man extends Human {

    @Override
    public void speak() {

        System.out.println("我是人，真的是人");

    }

    public static void main(String[] args) {

        Man a = new Man();
        a.speak();

    }

}
