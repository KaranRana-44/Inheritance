package com.company;

public class Limerick extends Poem {
    public Limerick() {
        super(5);
    }

    public int getSyllables(int k) {
        if (k == 1 || k == 2 || k == 5) {
            return 9;
        } else {
            return 6;
        }
    }

    public void printRhythm() {
        for (int i = 1; i <= this.getNumlines(); i++) {
            for (int j = 0; j < getSyllables(i); j++) {
                System.out.print("ta");
                if (j != getSyllables(i)-1) {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}
