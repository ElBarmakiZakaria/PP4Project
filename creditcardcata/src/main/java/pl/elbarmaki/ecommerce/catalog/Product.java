package pl.elbarmaki.ecommerce.catalog;

import java.math.BigDecimal;
import java.util.UUID;

public class Product {
    private final String name, description;
    private final String id;
    private BigDecimal price;

    public Product(UUID id, String name, String d){
        this.id = id.toString();
        this.name = name;
        this.description = d;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void changePrice(BigDecimal newPrice){
        this.price = newPrice;
    }
}
