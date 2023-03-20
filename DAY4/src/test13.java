import java.sql.SQLOutput;

public class test13 {
    //  题目7（较难）
//    中国有闰年的说法。闰年的规则是：四年一闰，百年不闰，四百年再闰。（年份能够被4整除但不能被100整除算是闰年，年份能被400整除也是闰年）。请打印出1988年到2019年的所有闰年年份。
//
//            ### 训练提示
//
//1. 从1988年到2019年有很多年，每年都需要判断，用什么知识点对每年进行判断？
//
//            ### 解题方案
//
//1. 使用while循环完成
//
//2. 使用for循环完成
//
//            以下以方案2为准
//
//### 操作步骤
//
//1. 定义for循环，循环开始是1988，结束是2019
//2. 在循环中对年份进行判断
//3. 如果符合闰年的判断条件，则打印该年份
    public static void main(String[] args) {
        int i = 1988;
        int j = 2019;
        int lrapYear = 0;
        while (j > i) {
            if (i % 4 == 0 && i % 100 != 0) {
                lrapYear++;
                i++;
            } else if (i % 400 == 0) {
                lrapYear++;
                i++;
            } else {
                i++;
            }
        }
        System.out.println(lrapYear);
    }
}