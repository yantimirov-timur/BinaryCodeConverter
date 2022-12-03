package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputProcessorTest {
    private final InputProcessor inputProcessor = new InputProcessor();

    @Test
    void isCorrectBinaryDigit() {
        String inputNum = "23123";
        boolean result = inputProcessor.isCorrectBinaryDigit(inputNum);
        assertFalse(result);

        String correctNum = "10101";
        boolean correctResult = inputProcessor.isCorrectBinaryDigit(correctNum);
        assertTrue(correctResult);
    }

    @Test
    void isCorrectConvertMode() {
        String wrongArg = "-hj";
        String correctArg = "-bg";
        boolean result = inputProcessor.isCorrectConvertMode(correctArg);
        boolean result1 = inputProcessor.isCorrectConvertMode(wrongArg);
        assertFalse(result);
        assertTrue(result1);
    }
}