package org.example.ZadaniaProgramowaniePDF.Exc10;

import java.time.LocalDate;

public interface ProductSDA {
    Double getPrice();

    Boolean isAvailable(LocalDate localDate);
}
