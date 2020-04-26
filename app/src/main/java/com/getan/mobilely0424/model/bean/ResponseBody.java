package com.getan.mobilely0424.model.bean;

/**
 * Created by Administrator on 2020/4/25.
 * 邮箱：405181076@qq.com
 */
public class ResponseBody {
    private int code;
    //private T data;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    /*public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }*/

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
