package com.combostrap.tui;

/**
 * ANSI RGB color
 *
 * @see <a href="https://en.wikipedia.org/wiki/ANSI_escape_code">Ansi Escape code</a>
 * <p>
 * A sequences of bytes (mostly starting with Esc and '[') are embedded into the text,
 * The terminal will interpret them as commands, not as character.
 * <p>
 * All sequences start with ESC (27 / hex 0x1B / oct 033), followed by a second byte in the range 0x40–0x5F (ASCII @A–Z[\]^_)
 * Standard ECMA-48: Control Functions for Coded Character Sets
 * http://www.ecma-international.org/publications/standards/Ecma-048.htm
 * <p>
 * Good article:
 * http://www.lihaoyi.com/post/BuildyourownCommandLinewithANSIescapecodes.html
 */
public class AnsiColors {


    // CSI SGR
    // https://en.wikipedia.org/wiki/ANSI_escape_code#SGR_parameters
    // CSI code m
    public static final char M = 'm';

    // CSI Colors
    // https://en.wikipedia.org/wiki/ANSI_escape_code#Colors

    // Colors 3/4 bit
    // https://en.wikipedia.org/wiki/ANSI_escape_code#3-bit_and_4-bit
    public static final int COLORS_RED_FOREGROUND_CODE = 31;
    public static final int COLORS_RED_BRIGHT_FOREGROUND = 91;
    public static final int COLORS_BLACK_FOREGROUND_CODE = 30;
    public static final int COLORS_WHITE_BACKGROUND_CODE = 47;
    static final String COLORS_RED = VT100.CSI + COLORS_RED_FOREGROUND_CODE + M; // Red
    static final String COLORS_RED_BRIGHT = VT100.CSI + COLORS_RED_BRIGHT_FOREGROUND + M; // Bright Red
    static final String COLORS_BLACK = VT100.CSI + COLORS_BLACK_FOREGROUND_CODE + M; // Black
    static final String COLORS_BLACK_ON_WHITE = VT100.CSI + COLORS_BLACK_FOREGROUND_CODE + ';' + COLORS_WHITE_BACKGROUND_CODE + M;
    static final String COLORS_RESET = VT100.CSI + 39 + ';' + 49 + M; // Reset colors attributes


    /**
     * Print the colors on 8 bit as defined here
     * <a href="https://en.wikipedia.org/wiki/ANSI_escape_code#8-bit">...</a>
     */
    public static void print8BitColorPalette() {
        // Ansi 8 bit
        for (int i = 0; i < 256; i += 1) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.printf(VT100.CSI + "38;5;%s" + AnsiColors.M + " %d " + VT100.RESET, i, i);
        }
    }


    /**
     * Example:
     * <pre>{@code colorize("original text","38;5;33")}
     * @param string - the string to colorize
     * @param color_sequence - the color sequence
     * @return an ascii control sequence that colors the string with the provided color code
     */
    String colorize(String string, String color_sequence) {
        return VT100.CSI + color_sequence + M + string + VT100.RESET;
    }


}
