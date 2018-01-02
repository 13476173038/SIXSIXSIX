/**
 * Project Name:dt59homework
 * File Name:Limousine.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:30:15
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:30:15 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class Limousine extends Car {

    Limousine() {

        setMake("载人");
        System.out.println("我的作用是" + getMake());
    }

    @Override
    public void puepose() {

        System.out.println("我的作用是载人");

    }

}
