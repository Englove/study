
//        某商场购物可以打折，具体规则如下：
//
//​	普通顾客购不满100元不打折，满100元打9折；
//
//​	会员购物不满200元打8折，满200元打7.5折；
//
//​	不同打折规则不累加计算。
//
//        请根据此优惠计划进行购物结算，键盘录入顾客的类别（0表示普通顾客，1表示会员）和购物的折前金额（整数即可），输出应付金额（小数类型）。


import java.lang.reflect.Member;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int member = 0;
        int shopAmout = 0;
        double payable = 0.0;
        System.out.println("购物金额");
        shopAmout = sc.nextInt();
        System.out.println("是否是会员");
        member = sc.nextInt();
        if (member == 0) {
            if (shopAmout < 100) {
                payable = shopAmout;
            } else {
                payable = shopAmout * 0.9;
            }
        }else if (member == 1) {
            if (shopAmout < 200) {
                payable = shopAmout * 0.8;
            } else {
                    payable = shopAmout * 0.75;

                }
            }
        else {
                System.out.println("你输入的数据有误。");
            }System.out.println(payable);
        }
    }

