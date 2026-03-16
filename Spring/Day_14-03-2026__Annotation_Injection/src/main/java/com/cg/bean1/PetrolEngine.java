package com.cg.bean1;


import org.springframework.stereotype.Component;

@Component
public class PetrolEngine implements IEngine{
    @Override
    public String getBHP() {
        return "Petrol Engine: 150 BHP";
    }
}
