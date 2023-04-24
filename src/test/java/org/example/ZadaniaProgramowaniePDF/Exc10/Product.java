package org.example.ZadaniaProgramowaniePDF.Exc10;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Product {
     double getPrice();
     boolean isAvaible(LocalDate date);
}
