/**
 * Project Name:dt59homework
 * File Name:TestCar.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:32:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:32:12 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class TestCar {

    public static void main(String[] args) {

        getCar(new Truck());
    }

    public static void getCar(Car car) {
        car.setMake("载货");
        System.out.println(car.getMake());
    }

}
