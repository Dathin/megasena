package io.github.dathin;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        var set = new HashSet<Integer>();
        var random = new Random();

        System.out.print("| ");
        while (set.size() < 6) {
            var luckyNumber = random.nextInt(61);
            if(luckyNumber > 0) {
                // I really hope this + 1 is the best idea instead of increase bounds and ignore 0. If some day all numbers turn out to be my number - 1 it would be very funny. LOL
                // Reversed since I was getting paranoid about it
                set.add(luckyNumber);
            }
        }
        
        var printSet = new TreeSet<>(set);
        for (Integer luckyNumber : printSet) {
            System.out.printf(luckyNumber + " | ");
        }
        
    }

}
