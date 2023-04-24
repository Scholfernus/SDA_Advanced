package org.example.ZadaniaProgramowaniePDF.Exc10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BasketSDA {
    private final List<ProductSDA> productList = new ArrayList<>();

    public void add(ProductSDA product) {
        productList.add(product);
    }

    public void remove(ProductSDA product) {
        productList.remove(product);
    }

    public List<ProductSDA> getProductList() {
        return new ArrayList<>(productList);
    }
}

