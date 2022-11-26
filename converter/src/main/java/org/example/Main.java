package org.example;

public class Main {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[1]);
        int result;
        switch (args[0]) {
            case ("-bg"):
                Converter binaryToGray = new BinaryToGrayConverter();
                result = binaryToGray.convert(number);
                System.out.println(result);
                break;
            case ("--help"):
                System.out.println("Converter binary digits to gray code. You need use mode -bg (BinaryGray) or -gb (GrayBinary)." +
                        " After input mode, you need input binary digit (only 1 and 0).");
            case ("-gb"):
                //TODO
                break;
        }
    }
}