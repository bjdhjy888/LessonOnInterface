package com.company;

public class Virus implements LivingOrganisms{
    public int eat(){
        return 0;
    }

    public void travel(){
        System.out.println("move around.");
    }

    public String drink(){
        return "nothing";
    }

    public boolean isSenior() {
        return true;
    }
}
