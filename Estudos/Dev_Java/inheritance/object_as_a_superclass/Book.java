package object_as_a_superclass;

public class Book {
    String ISBN;

    public Book(
            String ISBN
    ) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public boolean equals(
        Object obj
    ) {
        if (
            obj instanceof Book
        ) {
            return ISBN.equals(
                ((Book) obj).getISBN()
            );
        } else {
            return false;
        }
    }

    static void main() {
        Book firstBook = new Book(
            "0201914670"
        );

        Book secondBook = new Book(
            "02019146750"
        );

        if (
            firstBook.equals(
                secondBook
            )
        ) {
            System.out.printf(
                "%n" +
                "objects are equals" +
                "%n%n"
            );
        } else {
            System.out.printf(
                "%n" +
                "objects are not equals" +
                "%n%n"
            );
        }
    }
}