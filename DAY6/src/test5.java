import com.douchanghai.www11.Phonedemo;

import java.util.Scanner;
import java.util.Set;

public class test5 {
    public static void main(String[] args) {
        Phonedemo Sc = new Phonedemo();

        Sc.setBrand("qq");
        Sc.setPrice(1000);
        Sc.setColor("cc");

        System.out.println(Sc.getBrand());
        System.out.println(Sc.getColor());
        System.out.println(Sc.getPrice());
        Sc.call();

        Sc.sendMessage();

        //使用成员方法

    }
}