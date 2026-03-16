package com.cg.problem_04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource("classpath:data.properties")
public class SBU4 {
    @Value("${sbuId}")
    private String sbuCode;

    @Value("${sbuName}")
    private String sbuName;

    @Value("${sbuHead}")
    private String sbuHead;

    @Autowired
    private List<Employee4> empList;


    public String getSbuCode() {
        return sbuCode;
    }

    public void setSbuId(String sbuCode) {
        this.sbuCode = sbuCode;
    }

    public String getSbuName() {
        return sbuName;
    }

    public void setSbuName(String sbuName) {
        this.sbuName = sbuName;
    }

    public String getSbuHead() {
        return sbuHead;
    }

    public void setSbuHead(String sbuHead) {
        this.sbuHead = sbuHead;
    }

    public List<Employee4> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Employee4> empList) {
        this.empList = empList;
    }

    @Override
    public String toString() {
        return "SBU [sbuCode=" + sbuCode +
                ", sbuName='" + sbuName + '\'' +
                ", sbuHead='" + sbuHead + '\'' +
                ']';
    }
}
