/**
 * Project Name:dt59homework
 * File Name:TestDefaultValue.java
 * Package Name:dt59homework
 * Date:2017年12月27日下午3:50:13
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171227;

/**
 * Description: <br/>
 * Date: 2017年12月27日 下午3:50:13 <br/>
 * 
 * 
 * 
 * 编写一个类TypeDefaultValue，并定义十个属性，前八个属性分别定义为8种基本数据类型；最后两属性类型分别定义为String和int[];
 * 编写另一个类TestTypeDefaultValue，定义main方法，在main方法，输出TypeDefaultValue类对象的每一个属性值；
 * 观察每种类型属性，默认值是什么，并以注释的形式在属性前说明。
 * 
 * @author sunhao
 * @version
 * @see
 */
public class TestDefaultValue {

    public static void main(String[] args) {
        TypeDefaultValue t = new TypeDefaultValue();

        System.out.print(t.a + "  ");
        System.out.print(t.b + "  ");
        System.out.print(t.c + "  ");
        System.out.print(t.d + "  ");
        System.out.print(t.e + "  ");
        System.out.print(t.f + "  ");
        System.out.print(t.g + "  ");
        System.out.print(t.h + "  ");
        System.out.print(t.i + "  ");
        System.out.print(t.j + "  ");
        // 基本类型 默认值
        // boolean false
        // char '\u0000'(null)
        // byte (byte)0
        // short (short)0
        // int 0
        // long 0L
        // float 0.0f
        // double 0.0d

    }

}
