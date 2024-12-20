package com.example.common;

public class Result {

    private String code;
    private String msg;
    private Object data;

    public static Result success(){
        Result result = new Result();
        result.setCode("200");
        result.setMsg("请求成功");
        return result;
    }

        public static Result success(Object data){
        Result result = new Result();
        result.setCode("300");
        result.setData(data);
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.setCode("500");
        result.setMsg("服务器内部错误");
        return result;
    }

    public static Result error(String msg,String code){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
    public static Result error(String code){
        Result result = new Result();
        result.setCode(code);

        return result;
    }
    public String getCode(){
        return code;
    }


    public void  setCode(String code){
        this.code= code;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }
    public void setData(Object data){
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }
    public Object getData() {
        return data;
    }
}
