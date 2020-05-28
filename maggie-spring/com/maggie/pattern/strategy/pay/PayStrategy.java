package com.maggie.pattern.strategy.pay;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:支付策略类
 * author:MaggieHao
 * Date:2019-07-09
 * Time:22:59
 */
public class PayStrategy {

    public static  final String ALI_PAY="AliPay";
    public static  final String JD_PAY="JDPay";
    public static  final String WECHANT_PAY="WeChatPay";
    public static  final String UNION_PAY="UnionPay";
    public static  final String DEFAULT_PAY=ALI_PAY;

    private static Map<String,Payment> paymentStrategy = new HashMap<>();

    static {
        paymentStrategy.put(ALI_PAY,new AliPay());
        paymentStrategy.put(JD_PAY,new JDPay());
        paymentStrategy.put(WECHANT_PAY,new WeChatPay());
        paymentStrategy.put(UNION_PAY,new UnionPay());
    }

    /**
     * 通过统一路口实现动态策略
     * @param payKey
     * @return
     */
    public static Payment get(String payKey){
        if (!paymentStrategy.containsKey(payKey)){
            return paymentStrategy.get(DEFAULT_PAY);
        }
        return paymentStrategy.get(payKey);
    }


}
