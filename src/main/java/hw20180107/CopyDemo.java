/**
 * Project Name:dt59homework
 * File Name:CopyDemo.java
 * Package Name:hw20180107
 * Date:2018年1月7日下午5:55:23
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180107;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Description: <br/>
 * Date: 2018年1月7日 下午5:55:23 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class CopyDemo {

    public static void main(String[] args) {

        String file1Path = "";
        String file2Path = "";
        File file1 = null;
        File file2 = null;
        byte[] bt = new byte[1024];
        if (args.length == 2) {
            file1Path = args[0];
            file2Path = args[1];
            file1 = new File(file1Path);
            file2 = new File(file2Path);
            if (file1.exists() && file1.isFile()) {
                try {
                    FileInputStream fis = new FileInputStream(file1);
                    BufferedInputStream bis = new BufferedInputStream(fis);
                    FileOutputStream fos = new FileOutputStream(file2);
                    BufferedOutputStream bos = new BufferedOutputStream(fos);
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    while (bis.read(bt) > 0) {
                        bos.write(bt);
                    }
                    bos.close();
                    fos.close();
                    bis.close();
                    fis.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }

}
