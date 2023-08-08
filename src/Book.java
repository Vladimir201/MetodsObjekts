import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private  int publishingYear;

    public Book(String bookName, Author author, int publishingYear){

        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public Author getAuthor(){
        return this.author;
    }
    public String getBookName(){
        return this.bookName;
    }
    public int getPublishingYear(){
        return this.publishingYear;
    }
    public  void setPublishingYear(int year){
        this.publishingYear = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", publishingYear=" + publishingYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, publishingYear);
    }
}
