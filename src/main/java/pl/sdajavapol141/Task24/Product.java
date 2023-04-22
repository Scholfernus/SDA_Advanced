package pl.sdajavapol141.Task24;

import java.math.BigDecimal;

public class Product {
    private BigDecimal price;

    public Product(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
