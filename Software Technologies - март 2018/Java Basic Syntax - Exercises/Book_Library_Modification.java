import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Book_Library_Modification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(sc.nextLine());
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        ArrayList<Book> allBooks = new ArrayList<>();
        Library library = new Library();

        for (int i = 0; i < n; i++) {
            String[] tokens = sc.nextLine().split("\\s+");
            Book newBook = new Book(tokens[0], tokens[1], tokens[2], LocalDate.from(formatter.parse(tokens[3])), tokens[4], Double.parseDouble(tokens[5]));
            allBooks.add(newBook);
        }
        library.setBooks(allBooks);

        HashMap<String, LocalDate> result = new HashMap<>();

        for (Book currentBook : allBooks) {
            result.put(currentBook.title, currentBook.getReleaseDate());
        }
        LocalDate wantedDate = LocalDate.from(formatter.parse(sc.nextLine()));
        result.entrySet().stream().filter(e -> e.getValue().isAfter(wantedDate)).sorted(Map.Entry.<String, LocalDate>comparingByValue()
                .thenComparing(Map.Entry.comparingByKey()))
                .forEach((e) -> {
                    System.out.printf("%s -> ", e.getKey());
                    System.out.printf(formatter.format(e.getValue()) + "\n");
                });
    }

    public static class Library{
        private String name;
        private ArrayList<Book> books;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<Book> getBooks() {
            return books;
        }

        public void setBooks(ArrayList<Book> books) {
            this.books = books;
        }
    }

    public static class Book {
        private String title;
        private String author;
        private String publisher;
        private LocalDate releaseDate;
        private String ISBNnumber;
        private Double price;

        public Book(String title, String author, String publisher, LocalDate releaseDate, String ISBNnumber, Double price) {
            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.releaseDate = releaseDate;
            this.ISBNnumber = ISBNnumber;
            this.price = price;
        }

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

        public String getISBNnumber() {
            return ISBNnumber;
        }

        public void setISBNnumber(String ISBNnumber) {
            this.ISBNnumber = ISBNnumber;
        }

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
    }
}
