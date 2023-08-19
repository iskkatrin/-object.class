public class Book {
    private String publisher;
    private Author author;
    private int publicationYear;

    public Book(String publisher, Author author, int publicationYear) {
        this.publisher = publisher;
        this.author = author;
        this.publicationYear = publicationYear;
    }
    public String getPublisher() {
        return this.publisher;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear){
            this.publicationYear = publicationYear;

        }
    }
