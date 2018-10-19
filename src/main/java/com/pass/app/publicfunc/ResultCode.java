package com.pass.app.publicfunc;

public enum ResultCode {
    /** 
     * �ɹ�
     */ 
    SUCCESS(200),
    /** 
     * ʧ�� 
     */ 
    FAIL(400),
    
    /** 
     * δ��֤��ǩ������
     */ 
    UNAUTHORIZED(401),
    
    /** 
     * �ӿڲ�����
     */ 
    NOT_FOUND(404),
    
    /** 
     * �������ڲ�����
     */ 
    INTERNAL_SERVER_ERROR(500);

    public int code;

    ResultCode(int code) {
        this.code = code;
    }
    
}

