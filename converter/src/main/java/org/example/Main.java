package org.example;

public class Main {

    public static void main(String[] args) {
        InputProcessor inputProcessor = new InputProcessor();
        if (inputProcessor.isCorrectConvertMode(args[0])) {
            System.out.println("Please, enter correct convert mode. -bg or -gb");
            return;
        }
        if (inputProcessor.isCorrectBinaryDigit(args[1])) {
            System.out.println("Please, enter correct binary digit. You can input only 1 and 0");
            return;
        }
        int number = Integer.parseInt(args[1]);
        int result;
        switch (args[0]) {
            case ("-bg"):
                Converter binaryToGray = new BinaryToGrayConverter();
                result = binaryToGray.convert(number);
                System.out.println(result);
                break;
            case ("-gb"):
                //TODO
                break;
        }
    }
}