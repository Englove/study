import java.util.Random;

public class test15 {
    public static void main(String[] args) {
//        创建一个长度为6的整数数组。请编写代码，随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印。
//
//### 训练提示
//
//        1、数组有6个元素，那么就要生成6次随机数。
//
//        2、要求所有元素的和，首先需要定义变量来存储求和结果，然后再获取所有元素，依次累加就可以了。
//
//### 解题方案
//
//        定义求和变量，遍历数组，累加元素值。
//
//### 操作步骤
//
//        1、定义长度为6的int数组。
//
//        2、创建随机数Random类对象。
//
//        3、遍历数组，在循环中生成随机数并给数组元素赋值。
//
//        4、定义求和变量，初始化值为0。
//
//        5、遍历数组，获取每一个元素，累加。
//
//        6、遍历结束，打印结果。
        int[] arr = new int[6];
        Random roll = new Random();
        for (int i = 0; i < arr.length; i++) {
            int number = roll.nextInt(100);
            arr[i] = number;
            System.out.println(arr[i]);
        }

    }
}
