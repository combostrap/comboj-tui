package com.combostrap.tui;


/**
 * VT100 Terminal Escape Codes
 * <p>
 * This class contains all standard VT100 escape sequences for terminal control.
 * VT100 was a video terminal introduced by Digital Equipment Corporation (DEC) in 1978.
 * These escape codes are still widely used in modern terminal emulators.
 * <p>
 * Usage example:
 * <pre>{@code
 * System.out.print(VT100.CLEAR_SCREEN + VT100.CURSOR_HOME);
 * System.out.println(VT100.RED + "Error!" + VT100.RESET);
 * }</pre>
 * <p>
 * Ref and info on sequence can be seen at <a href="https://en.wikipedia.org/wiki/ANSI_escape_code#Fe_Escape_sequences">wikipedia</a>
 */
public class VT100 {

    /**
     * Escape character
     * written as \e, octal \033 or Unicode \u001B, \x1b
     */
    public static final String ESC = "\u001B";

    /**
     * Starts most of the useful sequences
     * The name CSI comes from <a href="https://en.wikipedia.org/wiki/ANSI_escape_code#Fe_Escape_sequences">wikipedia</a>
     * Sequences are explaind <a href="https://en.wikipedia.org/wiki/ANSI_escape_code#Control_Sequence_Introducer_commands">here</a>
     */
    static final String CSI = ESC + '['; // Most useful,

    // ========== CURSOR CONTROL ==========

    /**
     * Move cursor to home position (0, 0)
     */
    public static final String CURSOR_HOME = CSI + "H";

    /**
     * Move cursor to specified position. Use with format: String.format(CURSOR_POS, row, col)
     */
    public static final String CURSOR_POS = CSI + "%d;%dH";

    /**
     * Move cursor up by n lines. Use with format: String.format(CURSOR_UP, n)
     */
    public static final String CURSOR_UP = CSI + "%dA";

    /**
     * Moves cursor to beginning of the line n (default 1) lines down.
     * Use with format: String.format(CURSOR_NEXT_LINE, n)
     */
    public static final String CURSOR_NEXT_LINE = CSI + "%dE";

    /**
     * Moves cursor to beginning of the line n (default 1) lines up
     * Use with format: String.format(CURSOR_PREVIOUS_LINE, n)
     */
    public static final String CURSOR_PREVIOUS_LINE = CSI + "%dF";

    /**
     * Move cursor down by n lines. Use with format: String.format(CURSOR_DOWN, n)
     */
    public static final String CURSOR_DOWN = CSI + "%dB";

    /**
     * Move cursor forward (right) by n columns. Use with format: String.format(CURSOR_FORWARD, n)
     */
    public static final String CURSOR_FORWARD = CSI + "%dC";

    /**
     * Move cursor backward (left) by n columns. Use with format: String.format(CURSOR_BACKWARD, n)
     */
    public static final String CURSOR_BACKWARD = CSI + "%dD";

    /**
     * Save current cursor position
     */
    public static final String CURSOR_SAVE = CSI + "s";

    /**
     * Restore saved cursor position
     */
    public static final String CURSOR_RESTORE = CSI + "u";

    /**
     * Hide cursor (make invisible)
     */
    public static final String CURSOR_HIDE = CSI + "?25l";

    /**
     * Show cursor (make visible)
     */
    public static final String CURSOR_SHOW = CSI + "?25h";


    // ========== SCREEN CONTROL ==========

    /**
     * Clear entire screen and move cursor to home
     */
    public static final String CLEAR_SCREEN = CSI + "2J";

    /**
     * Clear from cursor to end of screen
     */
    public static final String CLEAR_TO_END = CSI + "0J";

    /**
     * Clear from cursor to beginning of screen
     */
    public static final String CLEAR_TO_BEGIN = CSI + "1J";

    /**
     * Clear entire line
     */
    public static final String CLEAR_LINE = CSI + "2K";


    /**
     * Clear from cursor to end of line
     */
    public static final String CLEAR_LINE_END = CSI + "0K";

    /**
     * Clear from cursor to beginning of line
     */
    public static final String CLEAR_LINE_BEGIN = CSI + "1K";


    // ========== TEXT FORMATTING ==========

    /**
     * Reset all text attributes to default
     */
    public static final String RESET = CSI + "0m";

    /**
     * Enable bold/bright text
     */
    public static final String BOLD = CSI + "1m";

    /**
     * Enable dim/faint text (not widely supported)
     */
    public static final String DIM = CSI + "2m";

    /**
     * Enable italic text (not widely supported)
     */
    public static final String ITALIC = CSI + "3m";

    /**
     * Enable underlined text
     */
    public static final String UNDERLINE = CSI + "4m";

    /**
     * Enable blinking text (not widely supported)
     */
    public static final String BLINK = CSI + "5m";

    /**
     * Enable reverse video (swap foreground/background colors)
     */
    public static final String REVERSE = CSI + "7m";

    /**
     * Enable hidden/invisible text
     */
    public static final String HIDDEN = CSI + "8m";

    /**
     * Enable strikethrough text (not in original VT100)
     */
    public static final String STRIKETHROUGH = CSI + "9m";


    // ========== FOREGROUND COLORS (TEXT) ==========

    /**
     * Set text color to black
     */
    public static final String BLACK = CSI + "30m";

    /**
     * Set text color to red
     */
    public static final String RED = CSI + "31m";

    /**
     * Set text color to green
     */
    public static final String GREEN = CSI + "32m";

    /**
     * Set text color to yellow
     */
    public static final String YELLOW = CSI + "33m";

    /**
     * Set text color to blue
     */
    public static final String BLUE = CSI + "34m";

    /**
     * Set text color to magenta
     */
    public static final String MAGENTA = CSI + "35m";

    /**
     * Set text color to cyan
     */
    public static final String CYAN = CSI + "36m";

    /**
     * Set text color to white
     */
    public static final String WHITE = CSI + "37m";

    /**
     * Set text color to default
     */
    public static final String DEFAULT = CSI + "39m";


    // ========== BACKGROUND COLORS ==========

    /**
     * Set background color to black
     */
    public static final String BG_BLACK = CSI + "40m";

    /**
     * Set background color to red
     */
    public static final String BG_RED = CSI + "41m";

    /**
     * Set background color to green
     */
    public static final String BG_GREEN = CSI + "42m";

    /**
     * Set background color to yellow
     */
    public static final String BG_YELLOW = CSI + "43m";

    /**
     * Set background color to blue
     */
    public static final String BG_BLUE = CSI + "44m";

    /**
     * Set background color to magenta
     */
    public static final String BG_MAGENTA = CSI + "45m";

    /**
     * Set background color to cyan
     */
    public static final String BG_CYAN = CSI + "46m";

    /**
     * Set background color to white
     */
    public static final String BG_WHITE = CSI + "47m";

    /**
     * Set background color to default
     */
    public static final String BG_DEFAULT = CSI + "49m";


    // ========== BRIGHT/INTENSE FOREGROUND COLORS ==========

    /**
     * Set text color to bright black (gray)
     */
    public static final String BRIGHT_BLACK = CSI + "90m";

    /**
     * Set text color to bright red
     */
    public static final String BRIGHT_RED = CSI + "91m";

    /**
     * Set text color to bright green
     */
    public static final String BRIGHT_GREEN = CSI + "92m";

    /**
     * Set text color to bright yellow
     */
    public static final String BRIGHT_YELLOW = CSI + "93m";

    /**
     * Set text color to bright blue
     */
    public static final String BRIGHT_BLUE = CSI + "94m";

    /**
     * Set text color to bright magenta
     */
    public static final String BRIGHT_MAGENTA = CSI + "95m";

    /**
     * Set text color to bright cyan
     */
    public static final String BRIGHT_CYAN = CSI + "96m";

    /**
     * Set text color to bright white
     */
    public static final String BRIGHT_WHITE = CSI + "97m";


    // ========== BRIGHT/INTENSE BACKGROUND COLORS ==========

    /**
     * Set background color to bright black (gray)
     */
    public static final String BG_BRIGHT_BLACK = CSI + "100m";

    /**
     * Set background color to bright red
     */
    public static final String BG_BRIGHT_RED = CSI + "101m";

    /**
     * Set background color to bright green
     */
    public static final String BG_BRIGHT_GREEN = CSI + "102m";

    /**
     * Set background color to bright yellow
     */
    public static final String BG_BRIGHT_YELLOW = CSI + "103m";

    /**
     * Set background color to bright blue
     */
    public static final String BG_BRIGHT_BLUE = CSI + "104m";

    /**
     * Set background color to bright magenta
     */
    public static final String BG_BRIGHT_MAGENTA = CSI + "105m";

    /**
     * Set background color to bright cyan
     */
    public static final String BG_BRIGHT_CYAN = CSI + "106m";

    /**
     * Set background color to bright white
     */
    public static final String BG_BRIGHT_WHITE = CSI + "107m";


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
