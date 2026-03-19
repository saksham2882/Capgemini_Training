package com.cg.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public class ErrorDTO {

    private String errorMsg;
    @JsonFormat(pattern = "dd-MMM-yyyy")
    private LocalDate errorDate;
    private String uri;


    public ErrorDTO(){}

    public ErrorDTO(String errorMsg, LocalDate errorDate, String uri) {
        super();
        this.errorMsg = errorMsg;
        this.errorDate = errorDate;
        this.uri = uri;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public LocalDate getErrorDate() {
        return errorDate;
    }

    public void setErrorDate(LocalDate errorDate) {
        this.errorDate = errorDate;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}
