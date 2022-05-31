package io.github.dathin;

import java.util.HashSet;
import java.util.Random;

public class Main {


    public static void main(String[] args) {
        var set = new HashSet<Integer>();
        var random = new Random();

        System.out.print("| ");
        while (set.size() < 6) {
            var luckyNumber = random.nextInt(60);
            set.add(luckyNumber);
            System.out.printf((luckyNumber + 1) + " | ");
        }
    }

}
