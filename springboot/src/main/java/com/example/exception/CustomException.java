package com.example.exception;

import com.example.common.enums.ResultCodeEnum;

public class CustomException extends RuntimeException {

    private String code;

    private String msg;

    public CustomException(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public CustomException(ResultCodeEnum resultCode) {
        this.code = resultCode.code;
        this.msg = resultCode.msg;
    }
    public String getcode(){
        return code;
    }
    public void setcode(String code){
        this.code = code;
    }

    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }
}
