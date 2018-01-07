/**
 * Project Name:dt59homework
 * File Name:FileDemo.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午5:37:41
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.io.File;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午5:37:41 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class FileDemo {
    private final static Logger LOG = Logger.getLogger(FileDemo.class);

    public static void main(String[] args) {

        File f = new File("D:\\workspace");

        traverseFile(f);

    }

    // 遍历所有的文件
    static void traverseFile(File f) {

        File[] files = f.listFiles();

        for (File fi : files) {

            // 如果是目录
            if (fi.isDirectory()) {
                LOG.info(fi);
                ;

                // 递归
                traverseFile(fi);
            } else {
                // 如果是文件
                // 不打印隐藏文件
                if (!fi.isHidden()) {
                    LOG.info(fi);
                }
            }

        }

    }

}
