package com.douchanghai.www11;

public class girlfriend {
    private String name;
    private int age;
    private double height;


    public girlfriend() {
    }

    public girlfriend(String name, int age, double hight) {
        this.name = name;
        this.age = age;
        this.height = hight;
    }

    public void setName(String name) {
        this.name = name;


    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }
public  void  wash(){
    System.out.println("女朋友帮我洗衣服");
}
public  void cook(){
    System.out.println("女朋友给我做饭");
}
public void  show(){
    System.out.println("我女朋友叫" + name + ",身高" + height + "厘米,年龄"+age + "岁");

}
}
