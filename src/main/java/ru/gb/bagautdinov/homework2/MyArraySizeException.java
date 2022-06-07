package ru.gb.bagautdinov.homework2;

public class MyArraySizeException extends RuntimeException {
    private String exceptionMessage;

    public MyArraySizeException(String exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }

    @Override
    public String toString() {
        return "geekBrains.study.MyArraySizeException: " + exceptionMessage;
    }
}
