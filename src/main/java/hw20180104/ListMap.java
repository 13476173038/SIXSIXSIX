/**
 * Project Name:dt59homework
 * File Name:ListMap.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午3:23:44
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月4日 下午3:23:44 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class ListMap {
    private final static Logger LOG = Logger.getLogger(ListMap.class);

    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("孙");
        list.add("浩");
        list.add("的");
        list.add("作");
        list.add("业");

        Collections.replaceAll(list, "的", "滴");
        LOG.info(list);

        list.remove("滴");
        LOG.info(list);

        LOG.info(list.get(3));

        list.add(2, "页");
        LOG.info(list);

        Map map = new HashMap();
        map.put("我", "123");
        map.put("你", "234");
        map.put("他", "456");
        map.put("她", "789");

        Iterator ser = map.keySet().iterator();
        while (ser.hasNext()) {
            LOG.info(ser.next());
        }

    }

}
