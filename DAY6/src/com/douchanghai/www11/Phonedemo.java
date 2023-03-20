package com.douchanghai.www11;

public class Phonedemo {
    // 题目1（完成）
//    定义手机类，手机有品牌(brand),价格(price)和颜色(color)三个属性，有打电话call()和sendMessage()两个功能。
//变量
    private String brand;
    private int price;
    private String color;

    // 空参构造方法
    public Phonedemo() {
    }

    public Phonedemo(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public void setBrand(String brand) {
    this.brand=brand;}

    public void setPrice(int price) {
this.price=price;
    }

    public void setColor(String color) {
        this.color=color;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getPrice() {
        return this.price;
    }

    public String getColor() {
        return this.color;
    }


    public void call() {
        System.out.println("正在使用价格为" + price + "元" + color + "色的" + brand + "手机打电话....");
    }

    public void sendMessage() {
        System.out.println("正在使用价格为" + price + "元" + color + "色的" + brand + "手机发短信....");
    }

}
