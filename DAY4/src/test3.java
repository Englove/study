import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //分别录入三个数字
        System.out.println("请输入第一个整数。");
        int i = sc.nextInt();
        System.out.println("请输入第二个整数。");
        int j = sc.nextInt();
        System.out.println("请输入第三个整数。");
        int k = sc.nextInt();
        int min;
        if (i < j && i < k) {
            min = i;
        } else if (i > j && k < j) {
            min = k;
        } else {
            min = j;
        }
        System.out.println("最小值" + min);
    }
}
