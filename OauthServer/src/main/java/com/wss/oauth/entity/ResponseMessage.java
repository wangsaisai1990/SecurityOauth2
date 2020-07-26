package com.wss.oauth.entity;

public class ResponseMessage {

    private Integer code;
    private String message;

    public ResponseMessage() {
        super();
    }

    public ResponseMessage(Integer code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    // getter & setter

    public static ResponseMessage success() {
        return new ResponseMessage(0, "操作成功");
    }

    public static ResponseMessage fail() {
        return new ResponseMessage(99, "操作失败");
    }
}