package com.swu.chen.Util.BaseResult;

import lombok.Data;

@Data
public class SimpleResultDTO {
    private boolean status;
    private String reason;
    private Object detail;

    public SimpleResultDTO() {
    }

    public SimpleResultDTO(Object detail) {
        this.status = true;
        this.reason = "操作成功";
        this.detail = detail;
    }

    public SimpleResultDTO(boolean status, String reason) {
        this.status = status;
        this.reason = reason;
    }

}
