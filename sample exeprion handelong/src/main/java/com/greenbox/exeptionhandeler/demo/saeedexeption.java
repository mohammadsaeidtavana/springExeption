package com.greenbox.exeptionhandeler.demo;

public class saeedexeption extends RuntimeException {

    private  int code;
    private  String message ;

    public saeedexeption(String message, int code) {
        super(message);
        this.code = code;
        this.message=message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
