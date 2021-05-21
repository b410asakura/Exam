package com.company;

public class Margarita extends Pizza {
    private boolean isMeat;

    public Margarita(){}

    public Margarita(int somPrice, int gramWeight, boolean isMeat) {
        super(somPrice, gramWeight);
        this.isMeat = isMeat;
    }

    @Override
    public void cook(){
        super.cook();
        System.out.println("Готовиться пицца номер "+ getPizzaNumber() + " Маргарита");
    }

    @Override
    public void deliver(){
        System.out.println("Доставляется пицца номер " + getPizzaNumber() + " Маргарита");
    }

    @Override
    public String toString(){
        return "Маргарита " + (isMeat ? " с мясом " : " без мяса ") + super.toString();
    }

    public boolean isMeat() {
        return isMeat;
    }

    public void setMeat(boolean meat) {
        isMeat = meat;
    }
}

