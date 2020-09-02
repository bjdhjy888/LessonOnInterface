package com.company;

public class Ultraman implements LivingOrganisms{
    public int eat(){
        return 1;
    }

    public float speed(){
        return 80000;
    }

    public void travel(){
        System.out.println("flies around.");
    }

    public String drink(){
        return "nothing";
    }

    public boolean isSenior() {
        return true;
    }
}
