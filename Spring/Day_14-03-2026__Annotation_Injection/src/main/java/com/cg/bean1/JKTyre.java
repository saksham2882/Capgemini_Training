package com.cg.bean1;

import org.springframework.stereotype.Component;

//@Component
@Component("jk")
public class JKTyre implements ITyre{
    @Override
    public String getTyreDetails() {
        return "JK Tyre";
    }
}
