package com.maggie.pattern.strategy.pay;

/**
 * Description:一个关于支付的例子
 * author:MaggieHao
 * Date:2019-07-09
 * Time:22:19
 */
public class Order {
    String uid;
    String orderId;
    Double amount;

    public Order(String uid, String orderId, Double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public MsgResult pay(String payKey) {
        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额为：" + amount + ",开始扣款。。。。。");
        return payment.pay(uid,amount);
    }
}
