public class Main {
    public static void main(String[] args) {
        Author author = new Author("Иван ","Тургенев");
        Book book = new Book("Муму",author, 1854);
        System.out.println("Книга: " + book.getPublisher());
        System.out.println("Автор: " + book.getAuthor());
        System.out.println("Год издания: " + book.getPublicationYear());

        book.setPublicationYear(2000);
        System.out.println("Год переиздания: " + book.getPublicationYear());


        Author author1 = new Author("Лев ", "Толстой");
        Book book1 = new Book("Анна Каренина ", author, 1877);
        System.out.println("Книга: " + book1.getPublisher());
        System.out.println("Автор: " + book1.getAuthor());
        book1.setPublicationYear(1900);
        System.out.println("Год переиздания: " + book1.getPublicationYear());


    }
}