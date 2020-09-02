package com.company;

public class Bear implements LivingOrganisms {
    public int eat(){
        return 8;
    }

    public void travel(){
        System.out.println("10 km every day");
    }

    public String drink(){
        return "Coke";
    }

    public boolean isSenior() {
        return false;
    }
}
