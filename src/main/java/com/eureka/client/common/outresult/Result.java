package com.eureka.client.common.outresult;


import com.eureka.common.JsonHelper;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Result {
    private Object resultData;
    private String resultCode;
    private String resultDesc;

    public static Result successResult() {
        return result(ResultType.SUCCESS);
    }

    public static Result successResult(Object data) {
        Result result = successResult();
        result.setResultData(data);
        return result;
    }
    public static Result successResult(Object data, String resultDesc) {
        Result result = successResult();
        result.setResultData(data);
        result.setResultDesc(resultDesc);
        return result;
    }

    public static Result result(ResultType resultType) {
        Result result = new Result();
        result.setResultCode(resultType.getCode());
        result.setResultDesc(resultType.getDesc());
        return result;
    }

    public static Result result(String resultCode, String desc) {
        Result result = new Result();
        result.setResultCode(resultCode);
        result.setResultDesc(desc);
        return result;
    }

    public static Result result(String resultCode, String desc,Object data) {
        Result result = new Result();
        result.setResultCode(resultCode);
        result.setResultDesc(desc);
        result.setResultData(data);
        return result;
    }

    @JsonIgnore
    public boolean isError() {
        return !ResultType.SUCCESS.getCode().equals(getResultCode());
    }

    @JsonIgnore
    public boolean isNormal(){
        return ResultType.SUCCESS.getCode().equals(getResultCode());
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

    @Override
    public String toString(){
        return JsonHelper.parseToJson(this);
    }
}