package com.gdpt.cloudService.utils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Description:
 * 				200：表示成功
 * 				500：表示错误，错误信息在msg字段中
 * 				501：bean验证错误，不管多少个错误都以map形式返回
 * 				502：拦截器拦截到用户token出错
 * 				555：异常抛出信息
 */
@ApiModel
public class GdptJSONResult {

    // 响应业务状态
    @ApiModelProperty(name = "status", value = "响应业务状态 \n" +
            " * \t\t\t\t200：表示成功\n" +
            " * \t\t\t\t500：表示错误，错误信息在msg字段中\n", required = true, dataType = "Integer")
    private Integer status;

    // 响应消息
    @ApiModelProperty(name = "msg", value = "响应消息", required = true, dataType = "String")
    private String msg;

    // 响应中的数据
    @ApiModelProperty(name = "data", value = "响应中的数据", required = true, dataType = "Object")
    private Object data;

    public static GdptJSONResult build(Integer status, String msg, Object data) {
        return new GdptJSONResult(status, msg, data);
    }

    public static GdptJSONResult ok(Object data) {
        return new GdptJSONResult(data);
    }

    public static GdptJSONResult ok() {
        return new GdptJSONResult(null);
    }
    
    public static GdptJSONResult errorMsg(String msg) {
        return new GdptJSONResult(500, msg, null);
    }
    
    public static GdptJSONResult errorMap(Object data) {
        return new GdptJSONResult(501, "error", data);
    }
    
    public static GdptJSONResult errorTokenMsg(String msg) {
        return new GdptJSONResult(502, msg, null);
    }
    
    public static GdptJSONResult errorException(String msg) {
        return new GdptJSONResult(555, msg, null);
    }

    public GdptJSONResult() {

    }

    public GdptJSONResult(Integer status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public GdptJSONResult(Object data) {
        this.status = 200;
        this.msg = "success";
        this.data = data;
    }


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
