package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;

/**
 * http请求返回的最外层对象
 * Created by SqMax on 2018/3/17.
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO<T> implements Serializable{

    private static final long serialVersionUID = 3068837394742385883L;
    /**错误码**/
    private Integer code;

    /**提示信息**/
    private String msg;

    /**具体内容**/
    private T data;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
