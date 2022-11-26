package org.example;

public class InputProcessor {
    public boolean isCorrectBinaryDigit(String input) {
        return !input.matches("[10]+");
    }

    public boolean isCorrectConvertMode(String input) {
        return (!input.equals("-bg") && !input.equals("-gb") && !input.equals("--help"));
    }
}
