package com.cg.bean;

/*
* This Car Class is tightly coupled
*/

public class Car {
    private String name;
    private PetrolEngine petrolEngine;
    private MRFTyre mrfTyre;

    public Car() {}

    public Car(PetrolEngine petrolEngine, MRFTyre mrfTyre) {
        super();
        this.petrolEngine = petrolEngine;
        this.mrfTyre = mrfTyre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetrolEngine getPetrolEngine() {
        return petrolEngine;
    }

    public void setPetrolEngine(PetrolEngine petrolEngine) {
        this.petrolEngine = petrolEngine;
    }

    public MRFTyre getMrfTyre() {
        return mrfTyre;
    }

    public void setMrfTyre(MRFTyre mrfTyre) {
        this.mrfTyre = mrfTyre;
    }

    public void printCar(){
        System.out.println("Car name: " + name);
        System.out.println("BHP: " + petrolEngine.getBHP());
        System.out.println("Tyre Details: " + mrfTyre.getTyreDetails());
    }
}
