package pl.sdajavapol141.Task01;
import jdk.jfr.DataAmount;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;

@Data
@Builder
@Setter

public class Book {
    private String title;
    private String author;
    private int editionYear;
    private int copies;
}
