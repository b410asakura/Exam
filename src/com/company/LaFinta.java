package com.company;

public class LaFinta extends Pizza{
    private boolean isMashrooms;

    public LaFinta(){}

    public LaFinta(int somPrice, int gramWeight, boolean isMashrooms) {
        super(somPrice, gramWeight);
        this.isMashrooms = isMashrooms;
    }

    @Override
    public void cook(){
        super.cook();
        System.out.println("Готовиться пицца номер " + getPizzaNumber() + " Ля Финта");
    }

    @Override
    public void deliver(){
        System.out.println("Доставляется пицца номер " + getPizzaNumber() + " Ля Финта");
    }

    @Override
    public String toString(){
     return "Ля Финта " + (isMashrooms ? " с грибами " : " без грибов ") + super.toString();
    }

    public boolean isMashrooms() {
        return isMashrooms;
    }

    public void setMashrooms(boolean mashrooms) {
        isMashrooms = mashrooms;
    }
}
