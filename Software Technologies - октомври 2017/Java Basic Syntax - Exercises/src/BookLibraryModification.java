import java.time.LocalDate;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;

public class BookLibraryModification {
    public static void main(String[] args) {
        StartProgram();
    }

    private static void StartProgram() {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());
        Library library = new Library();
        library.setBooks(new ArrayList<Book>());
        ArrayList<Book> books = new ArrayList<Book>();

        books = SetBooks(sc, n , books);
        library.setBooks(books);
        PringResult(library, sc);
    }

    private static ArrayList<Book> SetBooks(Scanner sc, Integer n, ArrayList<Book> books) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        for (Integer i = 0; i < n; i++){
            String[] currentSplit = sc.nextLine().split("\\s+");
            Book currentBook = new Book();
            currentBook.title = currentSplit[0];
            currentBook.author = currentSplit[1];
            currentBook.publisher = currentSplit[2];
            currentBook.setReleaseDate(LocalDate.from(formatter.parse(currentSplit[3])));
            currentBook.ISBN = currentSplit[4];
            currentBook.price = Double.parseDouble(currentSplit[5]);
            books.add(currentBook);
        }
        return  books;
    }

    private static void PringResult(Library library, Scanner sc) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String dateString = sc.nextLine();
        LocalDate date = LocalDate.from(formatter.parse(dateString));

        List<Book> titleDate = library
                .getBooks()
                .stream()
                .filter(x -> x.releaseDate.isAfter(date))
                .sorted(Comparator.comparing(Book::getReleaseDate).thenComparing(Book::getTitle))
                .collect(Collectors.toList());
        for (Book currentBook:titleDate){
            System.out.printf("%s -> %s%s", currentBook.title, currentBook.releaseDate.format(formatter), "\n");
        }
    }

    public  static class Book{
        String title;
        String author;
        String publisher;
        LocalDate releaseDate;
        String ISBN;
        double price;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getPublisher() {
            return publisher;
        }

        public void setPublisher(String publisher) {
            this.publisher = publisher;
        }

        public LocalDate getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(LocalDate releaseDate) {
            this.releaseDate = releaseDate;
        }

        public String getISBN() {
            return ISBN;
        }

        public void setISBN(String ISBN) {
            this.ISBN = ISBN;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

    public static class Library {
        String name;
        ArrayList<Book> Books;

        public String getName() {
            return name;
        }

        public ArrayList<Book> getBooks() {
            return Books;
        }

        public void setBooks(ArrayList<Book> books) {
            this.Books = books;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
