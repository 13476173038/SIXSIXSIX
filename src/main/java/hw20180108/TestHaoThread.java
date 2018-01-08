/**
 * Project Name:dt59homework
 * File Name:TestHaoThread.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午8:05:41
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午8:05:41 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class TestHaoThread extends Thread implements HaoThread {
    private final static Logger LOG = Logger.getLogger(TestHaoThread.class);

    public static void main(String[] args) {

        TestHaoThread tht1 = new TestHaoThread();
        TestHaoThread tht2 = new TestHaoThread();
        TestHaoThread tht3 = new TestHaoThread();
        new Thread(tht1).start();
        tht1.setPriority(Thread.MAX_PRIORITY);
        new Thread(tht2).start();
        new Thread(tht3).start();
        tht3.setPriority(Thread.MIN_PRIORITY);
    }

}
