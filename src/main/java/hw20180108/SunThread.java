/**
 * Project Name:dt59homework
 * File Name:SunThread.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午4:24:17
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午4:24:17 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class SunThread extends Thread {
    private final static Logger LOG = Logger.getLogger(SunThread.class);

    private String name;

    SunThread(String name) {
        this.name = name;
    }

    public void run() {
        LOG.info(name);
    }

}
