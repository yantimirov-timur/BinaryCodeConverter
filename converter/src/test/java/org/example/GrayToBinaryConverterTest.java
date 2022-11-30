package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrayToBinaryConverterTest {

    private final GrayToBinaryConverter grayToBinaryConverter = new GrayToBinaryConverter();
    @Test
    void convert(){
        int expected = 1010;
        int inputDigit = 1111;
        int result = grayToBinaryConverter.convert(inputDigit);
        assertEquals(expected, result);
    }

}