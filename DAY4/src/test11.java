import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        //怎么知道数字有几位。
        int ge = 0;
        int  num = 0;

        while (x != 0) {
            ge = x % 10;
            x = x / 10;
            num = num * 10 + ge;
        }
        System.out.println(num);
    }
}
