import javax.xml.transform.Result;
import java.util.Scanner;

public class test4 {
    //某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
    //
    //​	存期		年利率（%）
    //
    //​	一年		2.25
    //
    //​	两年		2.7
    //
    //​	三年		3.25
    //
    //​	五年		3.6
    //
    //请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
    //
    //提示：
    //
    //​	存入金额和存入年限均由键盘录入
    //
    //​	本息计算方式：本金+本金×年利率×年限
    //1. 使用什么方式让用户输入内容？
    //2. 使用哪种if语句的格式对信息作出判断
    public static void main(String[] args) {
        double inter =0.0;
        Scanner deposit = new Scanner(System.in);
        System.out.println("请输入存款金额");
        int amout = deposit.nextInt();
        System.out.println("请输入存款期限");
        int year = deposit.nextInt();
        System.out.println(amout);
        System.out.println(year);

        if (year == 1) {
             inter = (float)2.25 * 0.01;System.out.println(inter);
        } else if (year == 2) {
         inter = (float)2.7 * 0.01;System.out.println(inter);
        } else if (year == 3) {
             inter = (float)3.25 * 0.01;
            System.out.println(inter);
        } else {
              inter = (float)3.6 * 0.01;
            System.out.println(inter);
        }

        System.out.println(inter);
        bankLnterest(amout,year,inter);
    }


   public static void bankLnterest(double a, double b, double c) {
        double result = a + (a * b * c);
        double result1 = a + a * b * c;
        System.out.print(b + "年到期凭存单支取本息" + result);
       System.out.println(b + "年到期凭存单支取本息" + result1);
        return;
    }
}
