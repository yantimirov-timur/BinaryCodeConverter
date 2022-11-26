package org.example;

public class Main {

    public static void main(String[] args) {
        InputProcessor inputProcessor = new InputProcessor();
        if (inputProcessor.isCorrectConvertMode(args[0])) {
            System.out.println("Please, enter correct convert mode. -bg or -gb");
            return;
        }
        if (!args[0].equals("--help")) {
            if (inputProcessor.isCorrectBinaryDigit(args[1])) {
                System.out.println("Please, enter correct binary digit. You can input only 1 and 0");
                return;
            }
            int number = Integer.parseInt(args[1]);
            int result;
            switch (args[0]) {
                case ("-bg") -> {
                    Converter binaryToGray = new BinaryToGrayConverter();
                    result = binaryToGray.convert(number);
                    System.out.println(result);
                }
                case ("-gb") -> {
                    Converter grayToBinary = new GrayToBinaryConverter();
                    result = grayToBinary.convert(number);
                    System.out.println(result);
                }
            }
        } else {
            System.out.println("Converter binary digits to gray code. You need use mode -bg (BinaryGray) or -gb (GrayBinary)." +
                    " After input mode, you need input binary digit (only 1 and 0).");
        }
    }
}