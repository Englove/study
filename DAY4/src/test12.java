import java.util.Scanner;

public class test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int a = sc.nextInt();
        System.out.println("再输入一个数字");
        int b = sc.nextInt();
        int i =0;
        while (a>=b){
             a=a-b;
             i++;
        }
        System.out.println("商为"+i);
        System.out.println("余数为"+a);
    }
}
