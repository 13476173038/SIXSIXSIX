/**
 * Project Name:dt59homework
 * File Name:Cat.java
 * Package Name:dt59homework
 * Date:2017年12月27日下午2:44:11
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:44:11 <br/>
 * 
 * 
 * 
 * 10.3.编写一个类，定义几个属性，再定义一个带参构造方法，（参数包括所有属性）；再定义一个类，定义main方法，构造前一个类的实例对象，输出其属性值；
 * 
 * @author sunhao
 * @version
 * @see
 */
class Cat {
    String name;

    String color;

    int age;

    public Cat(String a, String b, int c) {

        System.out.println("这条猫叫" + name + "，它的颜色是" + color + ",它的年纪是" + age + "岁");
    }

    public static void main(String[] args) {

        Cat cat = new Cat("旺财", "黄色", 1);

    }
}