

//2019年1月1日起，国家推出新的个人所得税政策，起征点上调值5000元。也就是说税前工资扣除三险一金（三险一金数额假设是税前工资的10%）后如果不足5000元，则不交税。如果大于5000元，那么大于5000元的部分按梯度交税，具体梯度比例如下：
//
//        ​	0 ~ 3000元的部分，交税3%
//
//        ​	3000 ~ 12000元的部分，交税10%
//
//        ​	12000 ~ 25000的部分 ， 交税20%
//
//        ​	25000 ~ 35000的部分，交税25%
//
//        ​	35000 ~ 55000的部分，交税30%
//
//        ​	55000 ~ 80000的部分，交税35%
//
//        ​	超过80000的部分，交税45%
//
//        比如：黑马某学员入职一家企业后，税前工资是15000，则他每月该交个税的部分是15000-1500-5000=8500元，个税缴纳数额是3000×3%+5500×10%=640元。税后工资12860元。
//
//        请完成一个个税计算程序，在用户输入税前工资后，计算出他对应的纳税数额，以及税后工资为多少？
//
//        ### 训练提示
//1. 工资的哪些部分是属于要纳税部分，如何计算？
//        2. 纳税比例有很多区间，用什么知识点能够对应多个区间？
//        3. 每个区间的纳税数额是多少，计算的规律是什么？


import javax.print.attribute.DateTimeSyntax;
import java.lang.annotation.IncompleteAnnotationException;
import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        double tax = 0.0;
        double aftertax = 0.0;

        if (0 > income) {
            System.out.println("请从新输入正确的数值");

        } else if (0 < income && income <= 3000) {
            tax = calculate(income, 0.03);
            aftertax = income - tax;

        } else if (3000 < income && income <= 12000) {
            tax = calculate(income, 0.1);
            aftertax = income - tax;
        } else if (12000 < income && income <= 25000) {
            tax = calculate(income, 0.2);
            aftertax = income - tax;

        } else if (25000 < income && income <= 35000) {
            tax = calculate(income, 0.25);
            aftertax = income - tax;

        } else if (35000 < income && income <= 55000) {
            tax = calculate(income, 0.30);
            aftertax = income - tax;

        } else if (55000 < income && income <= 80000) {
            tax = calculate(income, 0.35);
            aftertax = income - tax;

        } else if (80000 < income) {
            tax = calculate(income, 0.45);
            aftertax = income - tax;

        }
        System.out.println(tax);
        System.out.println(aftertax);
    }

    public static double calculate(double main1, double main2) {
        double result = main1 * main2;
        return result;
    }
}
