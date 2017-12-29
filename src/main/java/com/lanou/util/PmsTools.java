package com.lanou.util;

import java.util.Date;

/**
 * Created by 蓝鸥科技有限公司  www.lanou3g.com.
 */
public class PmsTools {
    /**
     * 生成一组随机字符串 可以作为插入表数据中的主键（2017122900002）
     **/
    public static String getRandomString(String key) { //length表示生成字符串的长度
//        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
//        Random random = new Random();
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < length; i++) {
//            int number = random.nextInt(base.length());
//            sb.append(base.charAt(number));
//        }
        //B2017122900000
        long seq = 0;
        if (key != null) {
            try {
                seq = Long.parseLong(key.substring(key.length() - 5));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        Date date = new Date();
        date.setTime(System.currentTimeMillis());
        String str = String.format("%1$tY%1$tm%1$td%2$05d", date, ++seq);
        return str;
    }

}

