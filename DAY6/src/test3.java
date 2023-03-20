import java.util.Arrays;

public class test3 {
    public static void main(String[] args) {
//        题目8：（较难）
//
//        需求：
//
//​	定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value)
//
//        功能：
//
//​	将数组arr中的元素从索引fromIndex开始到toIndex（不包含toIndex）对应的值改为value
       int [] AEE1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int[] myArray = fill(AEE1, 4,5, 2);
        System.out.println (Arrays.toString(myArray));

    }

    public static int[] fill(int[] arr, int fromIndex, int toIndex, int value) {
        for (int i = fromIndex; i < toIndex; i++) {
            arr[i] = value;

        }
        return arr;

    }
}