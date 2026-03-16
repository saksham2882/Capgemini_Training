package com.cg.bean1;

import org.springframework.stereotype.Component;

//@Component
@Component("cng")
public class CNGEngine implements IEngine{
    @Override
    public String getBHP() {
        return "CNG Engine: 110 BHP";
    }
}
