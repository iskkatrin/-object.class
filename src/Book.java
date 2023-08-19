public class Book {
    private String publisher;
    private String author;
    private int publicationYear;

    public Book(String publisher, String author, int pubclicationYear) {
        this.publisher = publisher;
        this.author = author;
        this.publicationYear = pubclicationYear;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear){
            this.publicationYear = publicationYear;
        }
    }
