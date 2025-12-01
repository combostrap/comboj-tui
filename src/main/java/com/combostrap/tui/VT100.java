package com.combostrap.tui;


/**
 * VT100 Terminal Escape Codes
 * <p>
 * This class contains all standard VT100 escape sequences for terminal control.
 * VT100 was a video terminal introduced by Digital Equipment Corporation (DEC) in 1978.
 * These escape codes are still widely used in modern terminal emulators.
 * <p>
 * Usage example:
 * System.out.print(VT100.CLEAR_SCREEN + VT100.CURSOR_HOME);
 * System.out.println(VT100.RED + "Error!" + VT100.RESET);
 */
public class VT100 {

    // ========== CURSOR CONTROL ==========

    /**
     * Move cursor to home position (0, 0)
     */
    public static final String CURSOR_HOME = "\u001B[H";

    /**
     * Move cursor to specified position. Use with format: String.format(CURSOR_POS, row, col)
     */
    public static final String CURSOR_POS = "\u001B[%d;%dH";

    /**
     * Move cursor up by n lines. Use with format: String.format(CURSOR_UP, n)
     */
    public static final String CURSOR_UP = "\u001B[%dA";

    /**
     * Move cursor down by n lines. Use with format: String.format(CURSOR_DOWN, n)
     */
    public static final String CURSOR_DOWN = "\u001B[%dB";

    /**
     * Move cursor forward (right) by n columns. Use with format: String.format(CURSOR_FORWARD, n)
     */
    public static final String CURSOR_FORWARD = "\u001B[%dC";

    /**
     * Move cursor backward (left) by n columns. Use with format: String.format(CURSOR_BACKWARD, n)
     */
    public static final String CURSOR_BACKWARD = "\u001B[%dD";

    /**
     * Save current cursor position
     */
    public static final String CURSOR_SAVE = "\u001B[s";

    /**
     * Restore saved cursor position
     */
    public static final String CURSOR_RESTORE = "\u001B[u";

    /**
     * Hide cursor (make invisible)
     */
    public static final String CURSOR_HIDE = "\u001B[?25l";

    /**
     * Show cursor (make visible)
     */
    public static final String CURSOR_SHOW = "\u001B[?25h";


    // ========== SCREEN CONTROL ==========

    /**
     * Clear entire screen and move cursor to home
     */
    public static final String CLEAR_SCREEN = "\u001B[2J";

    /**
     * Clear from cursor to end of screen
     */
    public static final String CLEAR_TO_END = "\u001B[0J";

    /**
     * Clear from cursor to beginning of screen
     */
    public static final String CLEAR_TO_BEGIN = "\u001B[1J";

    /**
     * Clear entire line
     */
    public static final String CLEAR_LINE = "\u001B[2K";

    /**
     * Clear from cursor to end of line
     */
    public static final String CLEAR_LINE_END = "\u001B[0K";

    /**
     * Clear from cursor to beginning of line
     */
    public static final String CLEAR_LINE_BEGIN = "\u001B[1K";


    // ========== TEXT FORMATTING ==========

    /**
     * Reset all text attributes to default
     */
    public static final String RESET = "\u001B[0m";

    /**
     * Enable bold/bright text
     */
    public static final String BOLD = "\u001B[1m";

    /**
     * Enable dim/faint text (not widely supported)
     */
    public static final String DIM = "\u001B[2m";

    /**
     * Enable italic text (not widely supported)
     */
    public static final String ITALIC = "\u001B[3m";

    /**
     * Enable underlined text
     */
    public static final String UNDERLINE = "\u001B[4m";

    /**
     * Enable blinking text (not widely supported)
     */
    public static final String BLINK = "\u001B[5m";

    /**
     * Enable reverse video (swap foreground/background colors)
     */
    public static final String REVERSE = "\u001B[7m";

    /**
     * Enable hidden/invisible text
     */
    public static final String HIDDEN = "\u001B[8m";

    /**
     * Enable strikethrough text (not in original VT100)
     */
    public static final String STRIKETHROUGH = "\u001B[9m";


    // ========== FOREGROUND COLORS (TEXT) ==========

    /**
     * Set text color to black
     */
    public static final String BLACK = "\u001B[30m";

    /**
     * Set text color to red
     */
    public static final String RED = "\u001B[31m";

    /**
     * Set text color to green
     */
    public static final String GREEN = "\u001B[32m";

    /**
     * Set text color to yellow
     */
    public static final String YELLOW = "\u001B[33m";

    /**
     * Set text color to blue
     */
    public static final String BLUE = "\u001B[34m";

    /**
     * Set text color to magenta
     */
    public static final String MAGENTA = "\u001B[35m";

    /**
     * Set text color to cyan
     */
    public static final String CYAN = "\u001B[36m";

    /**
     * Set text color to white
     */
    public static final String WHITE = "\u001B[37m";

    /**
     * Set text color to default
     */
    public static final String DEFAULT = "\u001B[39m";


    // ========== BACKGROUND COLORS ==========

    /**
     * Set background color to black
     */
    public static final String BG_BLACK = "\u001B[40m";

    /**
     * Set background color to red
     */
    public static final String BG_RED = "\u001B[41m";

    /**
     * Set background color to green
     */
    public static final String BG_GREEN = "\u001B[42m";

    /**
     * Set background color to yellow
     */
    public static final String BG_YELLOW = "\u001B[43m";

    /**
     * Set background color to blue
     */
    public static final String BG_BLUE = "\u001B[44m";

    /**
     * Set background color to magenta
     */
    public static final String BG_MAGENTA = "\u001B[45m";

    /**
     * Set background color to cyan
     */
    public static final String BG_CYAN = "\u001B[46m";

    /**
     * Set background color to white
     */
    public static final String BG_WHITE = "\u001B[47m";

    /**
     * Set background color to default
     */
    public static final String BG_DEFAULT = "\u001B[49m";


    // ========== BRIGHT/INTENSE FOREGROUND COLORS ==========

    /**
     * Set text color to bright black (gray)
     */
    public static final String BRIGHT_BLACK = "\u001B[90m";

    /**
     * Set text color to bright red
     */
    public static final String BRIGHT_RED = "\u001B[91m";

    /**
     * Set text color to bright green
     */
    public static final String BRIGHT_GREEN = "\u001B[92m";

    /**
     * Set text color to bright yellow
     */
    public static final String BRIGHT_YELLOW = "\u001B[93m";

    /**
     * Set text color to bright blue
     */
    public static final String BRIGHT_BLUE = "\u001B[94m";

    /**
     * Set text color to bright magenta
     */
    public static final String BRIGHT_MAGENTA = "\u001B[95m";

    /**
     * Set text color to bright cyan
     */
    public static final String BRIGHT_CYAN = "\u001B[96m";

    /**
     * Set text color to bright white
     */
    public static final String BRIGHT_WHITE = "\u001B[97m";


    // ========== BRIGHT/INTENSE BACKGROUND COLORS ==========

    /**
     * Set background color to bright black (gray)
     */
    public static final String BG_BRIGHT_BLACK = "\u001B[100m";

    /**
     * Set background color to bright red
     */
    public static final String BG_BRIGHT_RED = "\u001B[101m";

    /**
     * Set background color to bright green
     */
    public static final String BG_BRIGHT_GREEN = "\u001B[102m";

    /**
     * Set background color to bright yellow
     */
    public static final String BG_BRIGHT_YELLOW = "\u001B[103m";

    /**
     * Set background color to bright blue
     */
    public static final String BG_BRIGHT_BLUE = "\u001B[104m";

    /**
     * Set background color to bright magenta
     */
    public static final String BG_BRIGHT_MAGENTA = "\u001B[105m";

    /**
     * Set background color to bright cyan
     */
    public static final String BG_BRIGHT_CYAN = "\u001B[106m";

    /**
     * Set background color to bright white
     */
    public static final String BG_BRIGHT_WHITE = "\u001B[107m";


    // ========== SCROLLING ==========

    /**
     * Scroll entire screen up by one line
     */
    public static final String SCROLL_UP = "\u001BD";

    /**
     * Scroll entire screen down by one line
     */
    public static final String SCROLL_DOWN = "\u001BM";


    // ========== SPECIAL SEQUENCES ==========

    /**
     * Ring the terminal bell (produce beep sound)
     */
    public static final String BELL = "\u0007";

    /**
     * Backspace - move cursor one position left
     */
    public static final String BACKSPACE = "\u0008";

    /**
     * Tab - move cursor to next tab stop
     */
    public static final String TAB = "\u0009";

    /**
     * Line feed - move cursor down one line
     */
    public static final String LINE_FEED = "\n";

    /**
     * Carriage return - move cursor to beginning of line
     */
    public static final String CARRIAGE_RETURN = "\r";

    /**
     * Escape character
     */
    public static final String ESC = "\u001B";


    // ========== UTILITY METHODS ==========

    /**
     * Move cursor to specific row and column
     *
     * @param row Row position (1-based)
     * @param col Column position (1-based)
     * @return Escape sequence string
     */
    public static String moveCursor(int row, int col) {
        return String.format(CURSOR_POS, row, col);
    }

    /**
     * Move cursor up by specified number of lines
     *
     * @param n Number of lines to move up
     * @return Escape sequence string
     */
    public static String moveCursorUp(int n) {
        return String.format(CURSOR_UP, n);
    }

    /**
     * Move cursor down by specified number of lines
     *
     * @param n Number of lines to move down
     * @return Escape sequence string
     */
    public static String moveCursorDown(int n) {
        return String.format(CURSOR_DOWN, n);
    }

    /**
     * Move cursor forward (right) by specified number of columns
     *
     * @param n Number of columns to move forward
     * @return Escape sequence string
     */
    public static String moveCursorForward(int n) {
        return String.format(CURSOR_FORWARD, n);
    }

    /**
     * Move cursor backward (left) by specified number of columns
     *
     * @param n Number of columns to move backward
     * @return Escape sequence string
     */
    public static String moveCursorBackward(int n) {
        return String.format(CURSOR_BACKWARD, n);
    }

    /**
     * Colorize text with specified foreground and background colors
     *
     * @param text    Text to colorize
     * @param fgColor Foreground color code
     * @param bgColor Background color code
     * @return Colorized text with reset at the end
     */
    public static String colorize(String text, String fgColor, String bgColor) {
        return fgColor + bgColor + text + RESET;
    }

    /**
     * Colorize text with specified foreground color
     *
     * @param text    Text to colorize
     * @param fgColor Foreground color code
     * @return Colorized text with reset at the end
     */
    public static String colorize(String text, String fgColor) {
        return fgColor + text + RESET;
    }


}
