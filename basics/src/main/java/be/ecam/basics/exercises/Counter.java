package be.ecam.basics.exercises;

public class Counter {
    public static int count(int start, int steps) {
        if (steps < 0) throw new IllegalArgumentException("Steps < 0");
        return steps;
        // On limite le débord du byte en comptant simplement avec un entier
    }
}
