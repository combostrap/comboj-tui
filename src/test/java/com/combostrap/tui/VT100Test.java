package com.combostrap.tui;

import org.junit.jupiter.api.Test;

import static com.combostrap.tui.VT100.*;

class VT100Test {

    @Test
    void baseTest() {

        // Clear screen and move to home
        System.out.print(CLEAR_SCREEN + CURSOR_HOME);

        // Demonstrate colors
        System.out.println(RED + "Red text" + RESET);
        System.out.println(GREEN + "Green text" + RESET);
        System.out.println(BLUE + "Blue text" + RESET);
        System.out.println(YELLOW + "Yellow text" + RESET);

        // Demonstrate formatting
        System.out.println(BOLD + "Bold text" + RESET);
        System.out.println(UNDERLINE + "Underlined text" + RESET);
        System.out.println(REVERSE + "Reversed text" + RESET);

        // Demonstrate background colors
        System.out.println(BG_RED + WHITE + "White on red" + RESET);
        System.out.println(BG_GREEN + BLACK + "Black on green" + RESET);

        // Demonstrate utility method
        System.out.println(colorize("Colorized text!", BRIGHT_CYAN, BG_BLUE));

        // Demonstrate cursor positioning
        System.out.print(moveCursor(15, 10));
        System.out.println("Text at row 15, column 10");

        // Ring bell
        System.out.print(BELL);

        // Move back to bottom
        System.out.print(moveCursor(20, 1));

    }

}
