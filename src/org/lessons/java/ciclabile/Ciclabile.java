package org.lessons.java.ciclabile;
public class Ciclabile {
    int[] list;
    int currentIndex;

    public Ciclabile(){
        this.list = new int[0];
        this.currentIndex = 0;
    }

    public Ciclabile(int[] list){
        this.list = list;
        this.currentIndex = 0;
    }

    public void addElemento(int elemento){
        int[] newList = new int[list.length + 1];
        for (int i=0; i<list.length; i++){
            newList[i] = list[i];
        }
        newList[list.length] = elemento;
        list = newList;
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