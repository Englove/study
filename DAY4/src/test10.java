import javax.imageio.metadata.IIOMetadataFormatImpl;
import javax.sound.sampled.Mixer;
import java.util.Scanner;

public class test10 {
    //    ## 题目2
//
//    需求：键盘录入两个数字，表示一个范围。
//
//            ​           统计这个范围中。
//
//            ​	    既能被3整除，又能被5整除数字有多少个？
//
//            ### 训练提示
//
//1. 需要先判断键盘录入两个数字的大小关系
//2. 确定大小之后，可以循环得到范围里面的每一个数
//3. 找到一个符合条件的数字，统计变量就自增一次
//
//### 操作步骤
//
//1. 确定键盘录入的两个数字大小关系
//2. 定义for循环，找到范围之内的每一个数字
//3. 对每一个数字进行判断
//4. 符合条件统计变量自增一次
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 统计这个范围中
        int max = 0;
        int mix = 0;
        System.out.println("请输入一个数字");
        int num1 = sc.nextInt();
        System.out.println("请输入另一个数字。");
        int num2 = sc.nextInt();
        if (num1 < num2) {
            max = num2;
            mix = num1;

        } else if (num2 < num1) {
            max = num1;
            mix = num2;
        } else {
            System.out.println("这两个数字相等，请重新输入。");
        }
        //要确定两个数字的大小。
        int count = 0;
        for (int i = mix; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count = count+1;
            }


        }System.out.println(count);
    }


}
