/**
 * Project Name:dt59homework
 * File Name:StringDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:06:32
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午2:06:32 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
/*
 * 类 ： String public final class String extends Object implements
 * Serializabe,Comparable<String>，CharSeqence String 类代表字符串。
 * 
 * Java 程序中的所有字符串字面值（如"abc" ）都作为此类的实例实现。
 * 
 * 字符串是常量；它们的值在创建之后不能更改。字符串缓冲区支持可变的字符串。因为 String 对象是不可变的，所以可以共享. 例如： String str
 * = "abc";
 * 
 * Java语言提供对字符串串联符号（"+"）以及将其他对象转换为字符串的特殊支持。 字符串串联是通过 StringBuilder（或
 * StringBuffer）类及其 append 方法实现的。字符串转换是通过 toString 方法实现的， 该方法由 Object 类定义，并可被
 * Java 中的所有类继承。
 * 
 * 构造方法： 1.String() 初始化一个新创建的 String 对象，使其表示一个空字符序列 ；
 * 
 * 2.String(byte[]bytes)通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String。
 * 
 * 3.String(char[] value)分配一个新的 String，使其表示字符数组参数中当前包含的字符序列。
 * 
 * 4.String(StringBuffer buffer)分配一个新的字符串，它包含字符串缓冲区参数中当前包含的字符序列。
 * 
 * 5.String(StringBuilder builder)分配一个新的字符串，它包含字符串生成器参数中当前包含的字符序列。
 * 
 * 
 * 方法： 1. char charAt(int index) 返回指定索引处的 char 值；
 * 
 * 2.concat(String str)将指定字符串连接到此字符串的结尾。
 * 
 * 3. boolean equals(Object anObject)将此字符串与指定的对象比较 ；
 * 
 * 4.hashCode()返回此字符串的哈希码；
 * 
 * 5.toUpperCase() 使用默认语言环境的规则将此 String中的所有字符都转换为大写。
 */

// 以下为实现
public class StringDemo {
    private final static Logger LOG = Logger.getLogger(StringDemo.class);

    public static void main(String[] args) {
        // 1. char charAt(int index)
        // 返回指定索引处的 char 值。
        String a = "今天的面包不好吃";
        LOG.info(a.charAt(5));

        // 2.concat(String str)将指定字符串连接到此字符串的结尾。
        String name = "阿萨姆";
        String asm = name.concat("还可以");
        LOG.info(asm);

        // 3. boolean equals(Object anObject)将此字符串与指定的对象比较 ；
        String zz = "true";
        String z2 = "true";
        if (zz.equals(z2)) {
            LOG.info("相等");

            // 4.hashCode()返回此字符串的哈希码；
            String c = "哈希值";

            LOG.info(c.hashCode());

            // 5.toUpperCase() 使用默认语言环境的规则将此 String中的所有字符都转换为大写。
            String k = "axxxsx";
            LOG.info(k.toUpperCase());

        }
    }
}
