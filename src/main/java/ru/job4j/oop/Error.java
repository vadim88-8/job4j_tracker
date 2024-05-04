package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {

    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error error100 = new Error();
        error100.printInfo();
        Error error200 = new Error(true, 200, "Ok");
        error200.printInfo();
        Error error300 = new Error(false, 300, "Multiple Choise");
        error300.printInfo();
        Error error400 = new Error(false, 400, "Bad request");
        error400.printInfo();
    }
}
