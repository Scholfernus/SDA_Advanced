package pl.sdajavapol141.Task32;

import lombok.Builder;

@Builder
public class Book {
    private String title;
    private String author;
    private int editionYear;
    private int copies;
}
