package com.xcy.pojo;

public class PetSingle {
    private String strain;

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    @Override
    public String toString() {
        return "PetSingle{" +
                "strain='" + strain + '\'' +
                '}';
    }
}
