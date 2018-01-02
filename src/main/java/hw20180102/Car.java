/**
 * Project Name:dt59homework
 * File Name:Car.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午5:26:43
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;

/**
 * Description: <br/>
 * Date: 2018年1月2日 下午5:26:43 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public abstract class Car {
    private String name;

    private String make;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public abstract void puepose();

}
