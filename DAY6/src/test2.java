import java.awt.*;

public class test2 {
    public static void main(String[] args) {
//        题目6
//
//        需求：
//
//​	定义一个方法equals(int[] arr1,int[] arr2).功能：


        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8,9,10,12};
        int count = 0;
        if (arr1.length > arr2.length) {
            count = arr2.length;
        } else {
            count = arr1.length;
        }
        fill(arr1, arr2, count);

//
//​	比较两个数组是否相等（长度和内容均相等则认为两个数组是相同的）
//
//## 题目7：
//
//        需求：
//
//​	定义一个方法fill(int[] arr,int value)
//
//        功能：
//
//​	将数组arr中的所有元素的值改为value
    }


    public static void fill(int[] a, int[] b, int value) {
        int count = 0;
        int num = 0;
        if (a.length != b.length) {
            System.out.println("这两个数组不一样");
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]) {
                    num++;
                } else {
                    System.out.println("这两个数组不一样");
                }
            }
        }
        if (num == value) {
            System.out.println("这两个数组一样");

        }

    }

    public static void getMax(int a, int b) {
        //方法中定义两个变量，用于保存两个数字

        //使用分支语句分两种情况对两个数字的大小关系进行处理
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

    }
}
