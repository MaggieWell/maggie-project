package com.maggie.pattern.strategy.pay;

/**
 * Description:
 * author:MaggieHao
 * Date:2019-07-09
 * Time:22:21
 */
public class MsgResult {
    private int code;
    private Object data;
    private String msg;

    public MsgResult(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "支付状态：{" +
                "code=" + code +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
