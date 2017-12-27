/**
 * Project Name:dt59homework
 * File Name:MaFei.java
 * Package Name:dt59homework
 * Date:2017年12月25日上午10:18:19
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package dt59homework;

/**
 * Description: <br/>
 * Date: 2017年12月25日 上午10:18:19 <br/>
 * 
 * @author sunhao
 * @version
 * @see
 */
public class MaFei {
    String name = "马飞";

    String hobby = "喊牛皮";

    String shout() {
        return "牛批";
    }

    void jump() {
        System.out.println("边跳边喊" + shout());
    }

}

class MaFeiFei {

    public static void main(String[] args) {
        MaFei MaFeiFei;
        MaFeiFei = new MaFei();

        System.out.println(MaFeiFei.shout());

    }
}