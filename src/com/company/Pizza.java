package com.company;

import java.util.Scanner;

public class Pizza {
    private int somPrice;
    private int gramWeight;
    private static int pizzaNumber;
    static final String[] orderArray = new String[3];


    public Pizza(){
    }

    public Pizza(int somPrice, int gramWeight){
        this.somPrice = somPrice;
        this.gramWeight = gramWeight;
    }

    public void cook(){
        pizzaNumber++;
    }

    public void deliver(){
        System.out.println("Доставляется пицца" + pizzaNumber);
    }

    @Override
    public String toString(){
        return " цена: " + somPrice + " вес: " + gramWeight;
    }

    public static void makeOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, сделайте заказ" +
                "\n // напишите название пиццы на русском только с маленькими буквами");
        orderArray[0] = scanner.next();
        if (orderArray[0].equals("пепперони")) {
            System.out.println("Острую или не острую?" +
                    "\n // напишите 'острая' или 'не_острая' ");
            orderArray[1] = scanner.next();
            System.out.println("Сколько пицц желаете?");
            orderArray[2] = scanner.next();
        }
        else if (orderArray[0].equals("маргарита")) {
            System.out.println("C мясом или без мяса?" +
                    "\n // напишите 'с_мясом' или 'без_мяса'");
            orderArray[1] = scanner.next();
            System.out.println("Сколько пицц желаете?");
            orderArray[2] = scanner.next();
        }
        else if (orderArray[0].equals("ля_финта")) {
            System.out.println("С грибами или без грибов?" +
                    "\n // напишите 'с_грибами' или 'без_грибов'");
            orderArray[1] = scanner.next();
            System.out.println("Сколько пицц желаете?");
            orderArray[2] = scanner.next();
        }
        else {
            System.out.println("Вашего заказа нет в меню" +
                    "\nПожалуйста, выберите пиццу из меню");
            makeOrder();
        }
        System.out.println("Хорошо, ваш заказ: \n" +
                orderArray[2] + " " + orderArray[0] + " "+ orderArray[1]);
    }

    public int getSomPrice() {
        return somPrice;
    }

    public void setSomPrice(int somPrice) {
        this.somPrice = somPrice;
    }

    public int getGramWeight() {
        return gramWeight;
    }

    public void setGramWeight(int gramWeight) {
        this.gramWeight = gramWeight;
    }

    public static int getPizzaNumber() {
        return pizzaNumber;
    }

    public static void setPizzaNumber(int pizzaNumber) {
        Pizza.pizzaNumber = pizzaNumber;
    }
}
