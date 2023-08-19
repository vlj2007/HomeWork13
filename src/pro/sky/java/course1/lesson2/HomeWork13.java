package pro.sky.java.course1.lesson2;

public class HomeWork13 {
    public static void main(String[] args) {
        MyApp();
    }

    public static void MyApp() {
        Author author = new Author("Emily", "Bronte");
        Book book = new Book("Wuthering Heights", author, 1847);
        System.out.println("Book Title : " + book.getBookTitle());
        System.out.println("Book Author : " + author.getName() + " " + author.getSurname());
        System.out.println("Book Year : " + book.getBookPublicationYear());
        book.setBookPublicationYear(1849);
        System.out.println("New Book Year : " + book.getBookPublicationYear());

        Author author1 = new Author("Mary", "Shelley");
        Book book1 = new Book("Frankenstein", author1, 1818);
        System.out.println("Book Title : " + book1.getBookTitle());
        System.out.println("Book Author : " + author1.getName() + " " + author1.getSurname());
        System.out.println("Book Year : " + book1.getBookPublicationYear());


    }
}
