package com.combostrap.tui;

/**
 * CSI (Control Sequence Indicator)
 * The base characters of the control sequence
 * <p>
 * <a href=https://en.wikipedia.org/wiki/ANSI_escape_code#CSI_sequences></a>
 * <p>
 * This sequence are used :
 *   * {@link AnsiColors}
 *   * {@link CursorMove}
 */
public class ControlSequence {

  // Windows
  // https://superuser.com/questions/413073/windows-console-with-ansi-colors-handling/1105718#1105718
  // Enable https://github.com/rg3/youtube-dl/issues/15758
  static final String ESC = "\033"; // octal \033 or unicode \u001B
  static final String ESCAPE_SEQUENCE_RESET_TO_INITIAL_STATE = ESC + 'c'; // Resets the device to its original state

  // CONTROL_SEQUENCE_INTRODUCER
  static final String ESCAPE_SEQUENCE_OPEN = ESC + '['; // Most useful,

}
