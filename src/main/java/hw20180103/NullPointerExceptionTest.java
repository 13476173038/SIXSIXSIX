/**
 * Project Name:dt59homework
 * File Name:NullPointerExceptionTest.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午4:13:53
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午4:13:53 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class NullPointerExceptionTest {
    private final static Logger LOG = Logger.getLogger(LogDemo.class);

    public static void main(String[] args) {

        String name = null;
        try {
            System.out.println(name.charAt(0));
        } catch (Exception c) {
            LOG.info(c);
            c.printStackTrace();
        }

    }
}
