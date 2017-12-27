/**
 * Project Name:dt59homework
 * File Name:Snake2.java
 * Package Name:dt59homework
 * Date:2017年12月27日下午5:36:44
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午5:36:44 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class Snake2 {

    public static void main(String[] args) {
        Snake s = new Snake();
        s.name = "蛇皮";
        s.gender = "男";
        s.walk();
        s.speak();
        /*
         * 1、外观上不同，静态的为斜体字 2、存在的区域不同，静态的单独存在于静态域中
         * 3、成员变量只能被对象所调用，静态变量可以被对象的方法调用，也可以通过类名调用。
         */
    }

}
