package com.eureka.client.common.outresult;

public enum ResultType {
    SUCCESS("WL-0000","Success"),
    FAIL("WL-0001","login fail"),
    LOGIN("WL-0002","need login"),
    ILLEGAL_ARGUMENTS("WL-0003","Illegal arguments"),
    SYSTEM_ERROR("WL-0004","System error"),
    NO_MATCHING_RESULTS("WL-0005","No matching results"),
    DUPLICATE_KEY("WL-0006","Duplicate key"),
    UPDATE_FAILED("WL-0007","Update failed"),
    UNAUTHORIZED("WL-0008","have not permission"),
    SIGNFAIL("WL-0009","sign fail"),
    NO_DATA_ACCESS("WL-1000","have not data access permission"),
    API_INVOTE_ERROR("WL-2000","api call fail"),
    NO_USER_IN_SYSTEM("WL-0010","user not exist in system"),
    LOGIN_CLOSED("WL-0011","this method to login is closed"),
    NO_USER_INFO("WL-0012","can not get user info by sso"),
    ORDERNO_HAS_EXIST("WL-0013","orderNo has exist"),
    SESSION_EXPIRED("WL-0014","session expired"),
    NO_ACCESS_LOGIN("WL-0015","no access to login"),
    MAP_BEAN_ERROR("WL-0016","map to bean error"),
    NO_DATA_EXIST("WL-0017","not exist data"),
    DB_OPERATION("WL-0018","database operation error"),
    SAVE_FAILED("WL-0019","Save failed"),
    EXPORT_FAILED("WL-0020","Export failed"),
    IMPORT_FAILED("WL-0021","Import failed"),
    OTHER_ERROR("WL-9999","other error"),
    STATUS_ERROR("WL-0022","status error")
    ;
    private String code;
    private String desc;

    ResultType(String code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public String getCode(){
        return this.code;
    }

    public String getDesc(){
        return this.desc;
    }
}
