package com.cg.bean1;


import org.springframework.stereotype.Component;

@Component
public class MRFTyre implements ITyre {

    @Override
    public String getTyreDetails() {
        return "MRF Tyre";
    }
}
