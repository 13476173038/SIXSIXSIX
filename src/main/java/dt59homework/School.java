/**
 * Project Name:dt59homework
 * File Name:School.java
 * Package Name:dt59homework
 * Date:2017年12月25日上午11:06:09
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description: <br/>
 * Date: 2017年12月25日 上午11:06:09 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class School {

    String a = "包老师";

    String b = "丁老师";

    String class1() {
        String b = "孙同学";
        return b;
    }

    String class2() {
        String b = "王同学";
        return b;
    }

    public static void main(String[] args) {
        School sc = new School();
        System.out.println(sc.class2() + "在" + sc.b + "这学习JAVA");

    }

}
