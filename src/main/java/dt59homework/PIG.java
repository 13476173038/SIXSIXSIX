/**
 * Project Name:dt59homework
 * File Name:PIG.java
 * Package Name:dt59homework
 * Date:2017年12月27日上午9:02:57
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description: <br/>
 * Date: 2017年12月27日 上午9:02:57 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class PIG {
    String name;

    String color;

    int age;

    public PIG() {

    }

    public PIG(String name) {
        this.name = name;

    }

    public PIG(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public PIG(String name, String color, int age) {
        this(name, color);

        this.age = 1;
    }

    public static void main(String[] args) {
        PIG p = new PIG();

    }

}
