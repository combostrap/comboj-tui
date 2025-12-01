package com.combostrap.tui;

import java.util.stream.IntStream;

/**
 * Progress indicator on the console
 */
public class ProgressIndicator {

    /**
     * Print progress by refreshing a ratio
     */
    public static void printProgressNumber() {

        System.out.println("Loading...");
        IntStream.range(0, 100).forEach(i -> {
                    sleep10ms();
                    System.out.printf(VT100.CLEAR_LINE + " %s%%", i);
                    System.out.flush();
                }
        );

    }

    /**
     * Print a progress bar
     */
    static void printProgressBar() {
        System.out.println("Loading...");
        int total = 100;
        int characterEvery = 4; // every advancement of 4 we will get a character
        int totalCharacters = total / characterEvery; // 25 characters
        IntStream.range(0, total).forEach(i -> {
                    int actualCharacters = (i + 1) / characterEvery;
                    String bar = "[" + (new String(new char[actualCharacters]).replace("\0", "#")) + (new String(new char[totalCharacters - actualCharacters]).replace("\0", " ")) + "]";
                    System.out.println(VT100.CLEAR_LINE + bar);
                }
        );
    }

    /**
     * Just a wrapper
     */
    private static void sleep10ms() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
