package com.mobigen.group1.team3.accounts.module.dto;

public class RsResultDto {
    public static final int RESULT_SUCCESS = 1;
    public static final int RESULT_NONE = 0;
    public static final int RESULT_FAIL = -1;

    private int result = RESULT_FAIL;
    private String errorCause = "";
    private String messageKey = "";
    private String errorMessage = "";

    private Object rs = null;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getErrorCause() {
        return errorCause;
    }

    public void setErrorCause(String errorCause) {
        this.errorCause = errorCause;
    }

    public String getMessageKey() {
        return messageKey;
    }

    public void setMessageKey(String messageKey) {
        this.messageKey = messageKey;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getRs() {
        return rs;
    }

    public void setRs(Object rs) {
        this.rs = rs;
        this.result = RESULT_SUCCESS;
    }
}
