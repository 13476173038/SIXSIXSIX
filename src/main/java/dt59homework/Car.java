/**
 * Project Name:dt59homework
 * File Name:Car.java
 * Package Name:dt59homework
 * Date:2017年12月27日上午11:08:57
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description: <br/>
 * Date: 2017年12月27日 上午11:08:57 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class Car {
    String name = "玛莎拉蒂";

    static String kind = "雷克萨斯ES";

    public static void main(String[] args) {
        System.out.println(Car.kind);
        Car car = new Car();

        System.out.println("我有一辆" + car.kind + "我想要一辆" + car.name);

    }

    public String getKind() {
        return kind;
    }

}
