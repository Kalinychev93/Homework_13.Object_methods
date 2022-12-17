public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 12. Objects and classes.");
        Author author1 = new Author("Jack ", "London");
        Author author2 = new Author("Leo ", "Tolstoy");
        Book book1 = new Book("Martin Eden", new Author(author1.getFirstName(), author1.getSurName()), 1909);
        Book book2 = new Book("Anna Karenina",new Author(author2.getFirstName(), author2.getSurName()), 1877);
        System.out.println("Название первой книги - " + book1.getName() + ", автор: " + author1.getFirstName() + author1.getSurName() + ", год публикации: " + book1.getPublicationYear());
        System.out.println("Название второй книги - " + book2.getName() + ", автор: " + author2.getFirstName() + author2.getSurName() + ", год публикации: " + book2.getPublicationYear());
        book2.setPublicationYear(1878);
        System.out.println("Название второй книги - " + book2.getName() + ", автор: " + author2.getFirstName() + author2.getSurName() + ", год публикации: " + book2.getPublicationYear());

        System.out.println("Homework 13");
        //проверка корректности работы метода toString
        System.out.println(author1);
        System.out.println(book2);

        //сравнение объектов
        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
        System.out.println(author1.equals(author2));

        Author author3 = new Author("Leo ", "Tolstoy");
        System.out.println(author2.hashCode());
        System.out.println(author3.hashCode());
        System.out.println(author2.equals(author3));

        System.out.println(book1.equals(book2));
    }

}
