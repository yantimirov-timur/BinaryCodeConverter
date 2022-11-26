package org.example;

public class BinaryToGrayConverter implements Converter {

    @Override
    public int convert(int number) {
        if (number == 0) {
            return 0;
        }
        // Extracting the last digit
        int a = number % 10;
        // Extracting the second last digit
        int b = (number / 10) % 10;
        // Else If last two digits
        // are opposite bits to each other
        if ((a & ~b) == 1 || (~a & b) == 1) {
            return (1 + 10 * convert(number / 10));
        }
        // Else If the last
        // two bits are same
        return (10 * convert(number / 10));
    }
}
