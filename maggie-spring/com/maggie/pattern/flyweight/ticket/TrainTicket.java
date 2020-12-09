package com.maggie.pattern.flyweight.ticket;

import java.util.Random;

/**
 * @Auther MaggieHao
 * @Date 2020-12-06
 * @Time 21:34
 */
public class TrainTicket implements ITicket{
    private String from;
    private String to;
    private int price;

    public TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public void showInfo(String bunk) {
        this.price = new Random().nextInt(500);
        System.out.println(from + "->" + to +"->" + bunk + "价格：" + this.price);
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        from.intern();
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
