package com.company;

public class Poem {
    private int lines;

    public Poem(int l){
        lines=l;
    }

    public int getNumlines(){
        return lines;
    }

    public void printRhythm(){
        System.out.println("Free verse!");
    }

    public void printTa(int k){
        for (int j = 0; j < k; j++) {
            System.out.print("ta");
        if (j != k-1){
            System.out.print("-");
            }
        }
        System.out.println();
    }

}
