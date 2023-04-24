package org.example.ZadaniaProgramowaniePDF.Exc10;

import java.time.LocalDate;
import java.util.List;

public class MainSDA {
    public static void main(String[] args) {
        ProductSDA milk = new GenericProductSDA(()->  10.0, (date)-> date.isAfter(LocalDate.now()));
        ProductSDA bread = new GenericProductSDA(()-> 25.0, (date)-> true);
        BasketSDA basket = new BasketSDA();
        basket.add(milk);
        basket.add(bread);
        List<ProductSDA> products = basket.getProductList();
        System.out.println(products);
        products.remove(milk);
        System.out.println(products);
        System.out.println(basket.getProductList());
        basket.remove(milk);
        System.out.println(basket.getProductList());
    }
}
