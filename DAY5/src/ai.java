import java.util.Scanner;

public class ai {
    public static void main(String[] args) {
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] newArr = new int[arr.length + 1]; // 创建新数组
        boolean inserted = false; // 是否已插入新元素
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (!inserted && number < arr[i]) { // 插入新元素
                newArr[j] = number;
                j++;
                inserted = true;
            }
            newArr[j] = arr[i];
        }
        if (!inserted) { // 如果新元素比所有元素都大，则插入到数组末尾
            newArr[newArr.length - 1] = number;
        }
        System.out.print("生成的新数组是：");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
