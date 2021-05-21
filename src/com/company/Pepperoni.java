package com.company;

public class Pepperoni extends Pizza{
    private boolean isHot;

    public Pepperoni(){}

    public Pepperoni(int somPrice, int gramWeight, boolean isHot){
        super(somPrice, gramWeight);
        this.isHot = isHot;
    }

    @Override
    public void cook(){
        super.cook();
        System.out.println("Готовиться пицца номер "+ getPizzaNumber() + " Пепперони");
    }

    @Override
    public void deliver(){
        System.out.println("Доставляется пицца номер " + getPizzaNumber() + " Пепперони");
    }

    @Override
    public String toString(){
        return "Пепперони " + (isHot ? " острая " : " не острая ") + super.toString();
    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }
}
