/**
 * Project Name:dt59homework
 * File Name:TestComputer.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午3:29:34
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

/**
 * Description: <br/>
 * Date: 2018年1月3日 下午3:29:34 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class TestComputer {

    public static void main(String[] args) {
        Computer player = new Player();
        Computer worker = new Worker();

        player.playcomputer();
        worker.work();

    }
}
