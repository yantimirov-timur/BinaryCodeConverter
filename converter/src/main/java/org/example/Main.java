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
            case ("-gb"):
                //TODO
                break;
        }
    }
}