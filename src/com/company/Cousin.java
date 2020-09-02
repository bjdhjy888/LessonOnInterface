package com.company;

public class Cousin implements LivingOrganisms{
    public int eat(){
        return 2;
    }

    public void travel(){
        System.out.println("Singapore every year.");
    }

    public String drink(){
        return "milk";
    }

    public boolean isSenior() {
        return true;
    }
}
