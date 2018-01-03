/**
 * Project Name:dt59homework
 * File Name:LogDemo.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午4:36:25
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午4:36:25 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class LogDemo {
    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    public static void main(String[] args) {

        LOG.info("日志输出");

    }

}
