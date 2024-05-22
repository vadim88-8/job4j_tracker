package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book theABC = new Book("Азбука", 33);
        Book theKamaSutra = new Book("Камасутра", 69);
        Book javaTheCompleteReference = new Book("Java: The Complete Reference", 1345);
        Book theCleanCode = new Book("Clean code", 464);
        Book[] books = new Book[4];
        books[0] = theABC;
        books[1] = theKamaSutra;
        books[2] = javaTheCompleteReference;
        books[3] = theCleanCode;
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getNumberOfPage());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book book : books) {
            if ("Clean code".equals(book.getName())) {
                System.out.println(book.getName() + " - " + book.getNumberOfPage());
            }
        }
    }
}
