package ru.job4j.checkstyle;

public class Broken {

    private int sizeOfEmpty = 10;
    private String surname;

    private static final String NEWVALUE = "";

    private String name;

    public Broken() {
    }

    public void method(int a, int b, int c, int d, int e, int f) {
    }

    public void echo() {
    }

    public void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }
}