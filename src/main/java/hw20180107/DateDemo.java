/**
 * Project Name:dt59homework
 * File Name:DateDemo.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午6:02:34
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午6:02:34 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class DateDemo {
    private final static Logger LOG = Logger.getLogger(DateDemo.class);

    public static void main(String[] args) {

        Date date = new Date();
        LOG.info(date);
        Date date1 = new Date(2018 - 1900, 0, 17);
        LOG.info(date1);
        Date date2 = new Date();
        LOG.info(date1);
        SimpleDateFormat SDF = new SimpleDateFormat();
        String date4 = SDF.format(date);
        LOG.info(date4);
    }

}
