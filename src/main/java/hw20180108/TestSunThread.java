/**
 * Project Name:dt59homework
 * File Name:TestSunThread.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午4:28:38
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午4:28:38 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class TestSunThread {
    private final static Logger LOG = Logger.getLogger(TestSunThread.class);

    public static void main(String[] args) {
        SunThread st1 = new SunThread("小明");
        SunThread st2 = new SunThread("小晃");
        SunThread st3 = new SunThread("小花");
        SunThread st4 = new SunThread("小魁");
        st1.start();
        st1.setPriority(Thread.MAX_PRIORITY);
        st2.start();
        st3.start();
        st3.setPriority(Thread.MIN_PRIORITY);
        st4.start();
    }

}
