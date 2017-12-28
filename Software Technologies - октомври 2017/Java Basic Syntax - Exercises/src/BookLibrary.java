import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookLibrary {
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
        PringResult(books);
    }

    private static ArrayList<Book> SetBooks(Scanner sc, Integer n, ArrayList<Book> books) {
        for (Integer i = 0; i < n; i++){
            String[] currentSplit = sc.nextLine().split("\\s+");
            Book currentBook = new Book();
            currentBook.title = currentSplit[0];
            currentBook.author = currentSplit[1];
            currentBook.publisher = currentSplit[2];
            currentBook.releaseDate = currentSplit[3];
            currentBook.ISBN = currentSplit[4];
            currentBook.price = Double.parseDouble(currentSplit[5]);
            books.add(currentBook);
        }
        return  books;
    }

    private static void PringResult(ArrayList<Book> books) {
        HashMap<String, Double> book = new HashMap<String, Double>();

        for (Book curretBook: books){
            if (!book.containsKey(curretBook.author)){
                book.put(curretBook.author, 0D);
            }
            book.put(curretBook.author, book.get(curretBook.author) + curretBook.price);
        }

        book.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(x -> System.out.printf("%s -> %.2f%s", x.getKey(), x.getValue(), "\n"));
    }

    public  static class Book{
         String title;
         String author;
         String publisher;
         String releaseDate;
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

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
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
