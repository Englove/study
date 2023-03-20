import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
//        定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）
//
//### 训练提示
//
//        1. 要找奇数和偶数只需要判断对2取余即可。
//        2. 找到一个奇数或偶数之后，把它放在哪个索引处？


        int[] arr = {12, 23, 34, 45, 67, 78, 11, 22};
        int left = 0;
        int right = arr.length;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArr[left] = arr[i];
                left ++;
            } else {
                newArr[right-1] = arr[i];
                right --;
            }

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + ",");


        }
        System.out.println();
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(newArr[i] +",");
        }


//### 解题方案
//
//        1. 定义一个新数组。把原数组的奇数放在新数组的左边，把原数组的偶数放在新数组的右边。
//
//        2. 不定义新数组。找到左边的偶数，和右边的奇数互换位置。
//
//        以下以方案1为准
//
//### 操作步骤
//
//        1. 定义出原数组arr，其中包含多个数字。
//        2. 定义新数组brr，和arr的长度一样。
//        3. 定义变量left，初始值是0准备从左边放元素，定义变量right，初始值是arr.length-1准备从右边放元素。
//        4. 对原数组arr进行遍历。
//        5. 如果元素是奇数，则放在新数组brr的左边，left变量加一。
//        6. 如果元素是偶数，则放在新数组brr的右边，right变量减一。
//        7. 遍历新数组brr打印最终结果。

    }
}
