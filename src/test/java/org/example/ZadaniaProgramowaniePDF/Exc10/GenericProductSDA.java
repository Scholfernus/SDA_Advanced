package org.example.ZadaniaProgramowaniePDF.Exc10;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.Supplier;

public class GenericProductSDA implements ProductSDA {
    private final Supplier<Double> priceSupplierSDA;
    private final Function<LocalDate, Boolean> availabilityFunctionSDA;

    public GenericProductSDA(final Supplier<Double> priceSupplierSDA, final Function<LocalDate, Boolean> availabilityFunctionSDA) {

        this.priceSupplierSDA = priceSupplierSDA;
        this.availabilityFunctionSDA = availabilityFunctionSDA;
    }


    @Override
    public Double getPrice() {
        return priceSupplierSDA.get();
    }

    @Override
    public Boolean isAvailable(LocalDate local) {
        return availabilityFunctionSDA.apply(local);
    }


}
