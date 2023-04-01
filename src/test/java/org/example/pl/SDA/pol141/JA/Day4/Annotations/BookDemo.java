package org.example.pl.SDA.pol141.JA.Day4.Annotations;

public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book("Java","Bloch",2020,"PWN");
        book.setTitle("Java");
        book.setAuthor("Bloch");
        book.setEditionYear(2020);
        System.out.println(book);
        //wykorzystanie lomboka z wykorzystaniem buildera
        Book build = Book.builder()
                .author("Freeman")
                .title("ASP.Net")
                .editionYear(2021)
                .publisher("PWN")
                .build();
    }
}
