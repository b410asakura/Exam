package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в нашу пиццерию\n" +
                "    			Наше меню:\n" +
                "1) Пепперони (острая / не острая)\n" +
                "2) Маргарита (с мясом / без мяса)\n" +
                "3) Ля_Финта (с грибами / без грибов)");

        Pizza.makeOrder();// метод, который берет заказ

        createPizza();// метод, который готовит и доставляет заказ

        offerToOrder();// метод, который предлагает сделать еще заказ
        offerToOrder();
    }

    public static void offerToOrder(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nЖелаете сделать еще заказ?" +
                "\n // напишите с маленькими буквами 'да' или 'нет'");
        String answer = scanner.next();
        if (answer.equals("да")) {
            Pizza.makeOrder();
            createPizza();
            System.out.println("Мы доставим ваш заказ в течении 30 мин\n");
        } else if (answer.equals("нет")) {
            System.out.println("Мы доставим ваш заказ в течении 30 мин\n");
        } else System.out.println("Ээ, мамбет, нормально жооп берсен");
    }

    // создание обьектов пицца разных типов
    public static void createPizza() {
        if (Pizza.orderArray[0].equals("пепперони")) {
            Pepperoni[] pepperoni = new Pepperoni[Integer.parseInt(Pizza.orderArray[2])];
            if (Pizza.orderArray[1].equals("острая")) {
                for (int i = 0; i < pepperoni.length; i++) {
                    pepperoni[i] = new Pepperoni(450, 500, true);
                    System.out.println(i + 1 + ") " + pepperoni[i]);
                    pepperoni[i].cook();
                    pepperoni[i].deliver();
                }
            } else if (Pizza.orderArray[1].equals("не_острая")) {
                for (int i = 0; i < pepperoni.length; i++) {
                    pepperoni[i] = new Pepperoni(450, 500, false);
                    System.out.println(i + 1 + ") " + pepperoni[i]);
                    pepperoni[i].cook();
                    pepperoni[i].deliver();
                }
            }
        } else if (Pizza.orderArray[0].equals("маргарита")) {
            Margarita[] margarita = new Margarita[Integer.parseInt(Pizza.orderArray[2])];
            if (Pizza.orderArray[1].equals("с_мясом")) {
                for (int i = 0; i < margarita.length; i++) {
                    margarita[i] = new Margarita(450, 500, true);
                    System.out.println(i + 1 + ") " + margarita[i]);
                    margarita[i].cook();
                    margarita[i].deliver();
                }
            } else if (Pizza.orderArray[1].equals("без_мяса")) {
                for (int i = 0; i < margarita.length; i++) {
                    margarita[i] = new Margarita(450, 500, false);
                    System.out.println(i + 1 + ") " + margarita[i]);
                    margarita[i].cook();
                    margarita[i].deliver();
                }
            }
        } else if (Pizza.orderArray[0].equals("ля_финта")) {
            LaFinta[] laFinta = new LaFinta[Integer.parseInt(Pizza.orderArray[2])];
            if (Pizza.orderArray[1].equals("с_грибами")) {
                for (int i = 0; i < laFinta.length; i++) {
                    laFinta[i] = new LaFinta(450, 500, true);
                    System.out.println(i + 1 + ") " + laFinta[i]);
                    laFinta[i].cook();
                    laFinta[i].deliver();
                }
            } else if (Pizza.orderArray[1].equals("без_грибов")) {
                for (int i = 0; i < laFinta.length; i++) {
                    laFinta[i] = new LaFinta(450, 500, false);
                    System.out.println(i + 1 + ") " + laFinta[i]);
                    laFinta[i].cook();
                    laFinta[i].deliver();
                }
            }
        }
    }
}