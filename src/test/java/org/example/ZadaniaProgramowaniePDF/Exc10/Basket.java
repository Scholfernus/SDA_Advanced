package org.example.ZadaniaProgramowaniePDF.Exc10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Product> productList;

    public Basket() {
    }

    public Basket(List<Product> productList) {
        this.productList = productList;
    }
    public void addProduct(Product product){
        productList.add(product);
    }
    public void removeProduct(Product product){
        productList.remove(product);
    }

    public List<Product> getProductList() {
        return new ArrayList<>(productList);
    }
    public double getTotalPrice(){
        return getProductList().stream().mapToDouble(Product::getPrice).sum();
    }
    public boolean isAvailable(LocalDate date){
        return productList.stream().allMatch(product -> product.isAvaible(date));
    }
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Product product1 = new GenericProduct(()->12.50, date -> date.isBefore(today.plusDays(5)));
        Product product2 = new GenericProduct(()->20.00, date -> date.isAfter(today));
        Product product3 = new GenericProduct(()->10.00, date -> true);
        Basket basket = new Basket();
        basket.addProduct(product1);
        basket.addProduct(product2);
        basket.addProduct(product3);
        List<Product> productList1 = basket.getProductList();
        System.out.println(product1);
    }
}
