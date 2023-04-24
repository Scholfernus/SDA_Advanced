package org.example.ZadaniaProgramowaniePDF.Exc10;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Supplier;

public class GenericProduct implements Product {
    private Supplier<Double> priceSupplier;
    private Function<LocalDate, Boolean> availabilityFunction;


    public GenericProduct(Supplier<Double> priceSupplier, Function<LocalDate, Boolean> availabilityFunction) {
        this.priceSupplier = priceSupplier;
        this.availabilityFunction = availabilityFunction;
    }

    @Override
    public double getPrice() {
        return priceSupplier.get();
    }

    @Override
    public boolean isAvaible(LocalDate date) {
        return availabilityFunction.apply(date);
    }

}
