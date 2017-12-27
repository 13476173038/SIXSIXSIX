/**
 * Project Name:dt59homework
 * File Name:Tiger.java
 * Package Name:dt59homework
 * Date:2017年12月27日下午2:24:24
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */
package dt59homework;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午2:24:24 <br/>
 * 
 * 
 * 10.2.编写一个类，定义几个属性，同时给属性赋值；再定义一个2无参数构造方法，在构造方法中，首先输出各属性值到控制台，再给属性赋值；观察输出值内容。
 * 
 * @author sunhao
 * @version
 * @see
 */
public class Tiger {

    String name = "旺财";

    String color = "黑色";

    int age = 1;

    public Tiger() {
        System.out.println("这条狗叫" + name + "，颜色是" + color + ",年纪有" + age + "岁");
    }

    public static void main(String[] args) {

        new Tiger();

    }

}
