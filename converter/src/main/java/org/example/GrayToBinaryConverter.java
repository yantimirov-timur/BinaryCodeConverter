package org.example;

public class GrayToBinaryConverter implements Converter {

    char flip(char c) {
        return (c == '0') ? '1' : '0';
    }

    @Override
    public int convert(int number) {
        String binary = "";
        String gray = Integer.toString(number);

        // MSB of binary code is same
        // as gray code
        binary += gray.charAt(0);

        // Compute remaining bits
        for (int i = 1; i < gray.length(); i++) {

            // If current bit is 0,
            // concatenate previous bit
            if (gray.charAt(i) == '0')
                binary += binary.charAt(i - 1);

                // Else, concatenate invert of
                // previous bit
            else
                binary += flip(binary.charAt(i - 1));
        }

        return Integer.parseInt(binary);
    }
}
