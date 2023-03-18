import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] authorsBook1 = {"Стивен Кинг"};
        Book book1 = new Book("Безнадега", authorsBook1, "альфа", 2015, 500, 300, "мягкий переплет");

        String[] authorBook2 = {"Ю Несбе"};
        Book book2 = new Book("Снеговик", authorBook2, "бета", 2014, 300, 200, "твердый переплет");

        String[] authorBook3 = {"Майк Омер"};
        Book book3 = new Book("Внутри убийцы", authorBook3, "гамма", 2008, 200, 100, "твердый переплет");

        Book[] books = {book1, book2, book3};

        System.out.println("книги авторства Стивена Кинга: " + booksByAuthor("Стивен Кинг", books));
        System.out.println("Книги изданные издательством бета: " + booksByPublisher("бета", books));
        System.out.println("книги напечатанные после 2009: " + booksAfterYear(2009, books));

    }

    public static List<Book> booksByAuthor(String author, Book[] books) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            for (String authorBook : book.getAuthors()) {
                if (author.equals(authorBook)) {
                    result.add(book);
                }
            }
        }

        return result;
    }

    public static List<Book> booksByPublisher(String publisher, Book[] books) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (publisher.equals(book.getPublisher())) {
                result.add(book);
            }
        }

        return result;
    }

    public static List<Book> booksAfterYear(int year, Book[] books) {
        List<Book> result = new ArrayList<>();

        for (Book book : books) {
            if (year < book.getYear()) {
                result.add(book);
            }
        }

        return result;
    }
}