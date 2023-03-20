import java.util.Scanner;
import java.util.Scanner;
public class test9 {
    public static void main(String[] args) {
        //键盘输入两个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int number2 = sc.nextInt();
        //获取最大值和最小值
        int max = number1 > number2 ? number1 : number2;
        int min= number1 < number2 ? number1 : number2;

        //统计个数
        int count = 0;
        for (int i = min; i <= max; i++) {
            if(i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }
        System.out.println(count);

    }
}