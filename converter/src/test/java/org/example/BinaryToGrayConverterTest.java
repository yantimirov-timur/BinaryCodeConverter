package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryToGrayConverterTest {
    private final BinaryToGrayConverter binaryToGrayConverter = new BinaryToGrayConverter();

    @Test
    void convertSuccess() {
        int expected = 1111;
        int inputDigit = 1010;
        int result = binaryToGrayConverter.convert(inputDigit);
        assertEquals(expected, result);
    }

}