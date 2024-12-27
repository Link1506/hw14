public class App {
    public static void main(String[] args) {
        Author author = new Author();
        Author authorOne = new Author("Юлия", "Медведева");
        System.out.println(authorOne);
        Author authorTwo = new Author("Алексей", "Небоходов");
        System.out.println(authorTwo);

        Book book = new Book();
        Book bookOne = new Book("Новогодняя сказка", 2024, authorOne);
        System.out.println(bookOne);
        Book bookTwo = new Book("Торговец миром", 2024, authorTwo);
        System.out.println(bookTwo);
        bookOne.setPublicationYear(2023);
        System.out.println("Год публикации изменен на " + bookOne.getPublicationYear());

    }
}