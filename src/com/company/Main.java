package com.company;

public class Main {

    public static void main(String[] args) {
        Circle[] circleArray = new Circle[10];
        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle(i + 1);
        }
        double[] areaArray = new double[circleArray.length];
        int count = 0;
        for (int i = 0; i < circleArray.length; i++) {
            areaArray[i] = circleArray[i].getArea();
            if ((int) areaArray[i] % 3 == 0) count++;
        }
        for (int i = 0; i < circleArray.length; i++) {
            System.out.println(i + 1 + ". area = " + (int) areaArray[i]);
        }
        System.out.println("count of circles with area 3 = " + count);
    }
}
