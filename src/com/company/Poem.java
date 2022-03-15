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

    public void printTa(){
        System.out.print("ta");
        if (j != getSyllables(i)-1) {
            System.out.print("-");
        }

    }

}
