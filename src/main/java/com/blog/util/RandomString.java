package com.blog.util;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: 十二_Hp
 * Date: 2019/10/14/014
 * Time: 21:54
 * Description: No Description
 */
public class RandomString {
    /**
     * 生成userid，blogid
     * @return
     */
    public static String getStringAndNum(){
        //生成9位id，id的组成 string+num  a-z A-Z 0-9
        //62*62*62*...   62的10次方

        Random r = new Random();

        //转换为ascll


        return "";

    }

    public static String getCharAndNumr() {

        Integer length=9;
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            String charOrNum = random.nextInt(2) % 2 == 0 ? "char" : "num"; // 输出字母还是数字
            if ("char".equalsIgnoreCase(charOrNum)){// 字符串
                int choice = random.nextInt(2) % 2 == 0 ? 65 : 97; // 取得大写字母还是小写字母
                sb.append((char) (choice + random.nextInt(26)));
            } else if ("num".equalsIgnoreCase(charOrNum)){// 数字
                sb.append(String.valueOf(random.nextInt(10)));
            }
        }
        return sb.toString();
    }


}
