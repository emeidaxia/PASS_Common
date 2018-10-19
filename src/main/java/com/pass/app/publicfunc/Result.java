package com.pass.app.publicfunc;


public class Result {
    /**
     * ��Ӧ״̬��
     */
    private int code;
    /**
     * ��Ӧ��ʾ��Ϣ
     */
    private String message;
    /**
     * ��Ӧ�������
     */
    private Object data;

    Result(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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


