package com.lanou.util;

import java.util.Random;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class PmsTools {
    /*表主键随机字符串的长度*/
    public static final int KEY_LENGTH = 10;

    /**
     * 生成一组随机字符串 可以作为插入表数据中的主键
     **/
    public static String getRandomString(int length) { //length表示生成字符串的长度
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

}

