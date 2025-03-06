package org.lessons.java.ciclabile;
public class Ciclabile {
    int[] list;
    int currentIndex;

    public Ciclabile(int[] list){
        this.list = list;
        this.currentIndex = 0;
    }

    public int getElementoSuccessivo(){
        if(currentIndex == list.length){
            System.out.println("La lista è finita");
            return -1;
        }else{
            int result = list[currentIndex];
            currentIndex++;
            return result;
        }
    }

    public boolean hasAncoraElementi(){
        return currentIndex < list.length;
    }

}