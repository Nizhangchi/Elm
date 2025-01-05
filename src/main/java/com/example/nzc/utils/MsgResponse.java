package com.example.nzc.utils;

public class MsgResponse {
    private Integer status; // 状态码，例如200表示成功，500表示服务器错误。

    private String message; // 消息内容，通常用于提供错误信息或成功信息的描述。

    private Object data; // 附加数据，可以是任何类型的对象，用于传输额外的信息。

    // 创建一个表示成功的响应。
    // 这个方法接收一个消息和一个数据对象，然后构建并返回一个MsgResponse实例。
    public static MsgResponse success(String message, Object data) {
        MsgResponse response = new MsgResponse();
        response.setStatus(200); // 设置状态码为200，表示请求成功。
        response.setMessage(message); // 设置消息内容。
        response.setData(data); // 设置附加数据。
        return response;
    }

    // 创建一个表示失败的响应。
    // 这个方法接收一个错误消息，然后构建并返回一个MsgResponse实例。
    public static MsgResponse fail(String message) {
        MsgResponse response = new MsgResponse();
        response.setStatus(500); // 设置状态码为500，表示服务器错误。
        response.setMessage(message); // 设置错误消息。
        response.setData(null); // 设置数据为null。
        return response;
    }

    // 以下是各个字段的getter和setter方法。
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
