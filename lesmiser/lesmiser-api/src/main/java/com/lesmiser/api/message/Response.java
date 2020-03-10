package com.lesmiser.api.message;

public class Response<T> {

	/**
     * 服务调用成功返回状态码
     */
    private static final boolean STATUS_TRUE = true;
    /**
     * 服务调用失败返回状态码
     */
    private static final boolean STATUS_FALSE = false;
    /**
     * 服务调用成功默认的CODE
     */
    private static final String SUCCESS_CODE = "00000000";
    /**
     * 服务调用成功默认的MSG
     */
    private static final String SUCCESS_MSG = "success";
    /**
     * 服务调用失败默认的CODE
     */
    public static final String ERROR_CODE = "-1001";

    /**
     * 服务调用返回状态码
     */
    private boolean status;

    /**
     * 调用服务成功或者失败返回的业务CODE
     */
    private String code;

    /**
     * 调用服务成功或者失败返回的业务MSG
     */
    private String msg;

    /**
     * 调用服务成功返回的数据
     */
    private T data;


    public Response() {

    }

    private Response(boolean status, String code, String msg, T data) {
        this.setStatus(status);
        this.setCode(code);
        this.setMsg(msg);
        this.setData(data);
    }

    public static <T> Response<T> success() {
        return new Response<T>(STATUS_TRUE, SUCCESS_CODE, SUCCESS_MSG, null);
    }

    public static <T> Response<T> success(String message) {
        return new Response<T>(STATUS_TRUE, SUCCESS_CODE, SUCCESS_MSG, (T) message);
    }

    public static <T> Response<T> success(T data) {
        return new Response<T>(STATUS_TRUE, SUCCESS_CODE, SUCCESS_MSG, data);
    }

    public static <T> Response<T> success(String message, T data) {
        return new Response<T>(STATUS_TRUE, SUCCESS_CODE, message, data);
    }

    public static <T> Response<T> success(String code, String message, T data) {
        return new Response<T>(STATUS_TRUE, code, message, data);
    }

    public static <T> Response<T> success(String code, String message) {
        return new Response<T>(STATUS_TRUE, code, message, null);
    }

    public static <T> Response<T> error() {
        return new Response<T>(STATUS_FALSE, ERROR_CODE, null, null);
    }
    
    public static <T> Response<T> error(String message) {
        return new Response<T>(STATUS_FALSE, ERROR_CODE, message, null);
    }

    public static <T> Response<T> error(String message, T data) {
        return new Response<T>(STATUS_FALSE, ERROR_CODE, message, data);
    }

    public static <T> Response<T> error(String code, String message, T data) {
        return new Response<T>(STATUS_FALSE, code, message, data);
    }

    public static <T> Response<T> error(String code, String message) {
        return new Response<T>(STATUS_FALSE, code, message, null);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Response [status=" + status + ", code=" + code + ", msg=" + msg + ", data=" + data + "]";
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
