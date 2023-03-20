import com.sun.source.doctree.SummaryTree;

import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
//        题目1
//
//​	键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();
        int j = 0;
        int mix = 0;
        //### 训练提示

//
//        1. number1和number2不知道谁大谁小，需要先判断大小关系
        if (num1 < num2) {
            System.out.println("数字一比数字二小");
             j = num2 - num1;
             mix = num1;
        } else {
            System.out.println("数字一比数字二大");
            j = num1 - num2;
            mix = num2;
        }

//        2. 确定大小之后，可以循环得到范围里面的每一个数


        int sum = 0;
        for (int i =0 ; i<=j; i++) {
            sum = sum +i+mix;

        }
        System.out.println(j);
        System.out.println(sum);
//        3. 把每一个数字进行累加即可
//


    }
}
