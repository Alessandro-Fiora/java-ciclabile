package org.lessons.java.ciclabile;

public class Main {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        Ciclabile ciclabile = new Ciclabile(list);

        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());
        
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());

        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());

        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());

        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());

        System.out.println(ciclabile.getElementoSuccessivo());

    }
}
