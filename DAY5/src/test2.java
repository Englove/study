import java.util.Scanner;

public class test2 {
    //
// 有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。再通过键盘录入一个整数数字。
// 要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。执行效果如下：
//    请输入一个整数数字：     50
//    生成的新数组是：12 14 23 45 50 66 68 70 77 90 91
    public static void main(String[] args) {
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(arr.length);
        int count = arr.length + 1;
        int[] newArr = new int[count];
        int inserIndex = 0;
        for (int i = 0; i < count - 1; i++) {
            if (arr[i] < number) {
                newArr[i] = arr[i];
                inserIndex++;
                newArr[newArr.length - 1] = number;
            } else if (arr[i] == number) {
                newArr[i] = number;
                newArr[inserIndex + 1] = arr[i];

            } else if (arr[i] > number) {
                newArr[inserIndex] = number;
                newArr[i + 1] = arr[i];
            }

//            System.out.println(count+"数字");

        }
        System.out.println(inserIndex);
        for (int i = 0; i < count; i++) {
            System.out.print(newArr[i] + " ");

        }
    }


}


//1. 数组的长度是不能改变的，所以增加一个元素需要定义一个新数组。
//            2. 数组元素是从小到大排列的，如何找到新元素存放的位置？
//
//            ### 解题方案
//
//​	使用数组的遍历，用元素依次和数字作比较，找到正确的存放位置。
//
//            ### 操作步骤
//
//1. 定义原数组arr，和一个比原数组长度大1的新数组brr。
//            2. 通过键盘录入的方式输入变量num的值。
//            3. 定义变量index用于记录num存放的索引位置。
//            4. 遍历数组，小于或等于num的元素直接存放到原来的位置，大于num的元素往后移动一个位置。
//            5. 存放结束之后，中间会空出一个位置,在遍历时用index记录这个位置。把num放在这个索引处。
//            6. 最终遍历新数组打印结果。

