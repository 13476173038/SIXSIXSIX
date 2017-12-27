/**
 * Project Name:dt59homework
 * File Name:Dog.java
 * Package Name:dt59homework
 * Date:2017年12月27日下午2:37:14
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:37:14 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class Dog {
    String name;

    String color;

    int age;

    public Dog(String name) {
        this.name = name;
        System.out.println(name);
    }

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
        System.out.println(name + color);
    }

    public Dog(String name, String color, int age) {
        this(name, color);
        this.age = age;
        System.out.println(name + color + age);
    }
}
