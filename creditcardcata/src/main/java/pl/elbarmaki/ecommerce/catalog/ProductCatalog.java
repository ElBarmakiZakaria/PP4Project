//package pl.elbarmaki.ecommerce.catalog;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.UUID;
//
//public class ProductCatalog {
//
//    private final ProductStorage products;
//
//    public ProductCatalog(ProductStorage products) {
//        this.products = products;
//    }
//
//    public List<Product> allProducts() {
//        return products.allProducts();
//
//    }
//
//    public String addProduct(String name, String description, String imageUrl) {
//        UUID id = UUID.randomUUID();
//        Product newP = new Product(id, name, description, imageUrl);
//
//        products.add(newP);
//
//        return id.toString();
//    }
//
//    public Product getProductById(String id) {
//        return products.getProductBy(id);
//
//    }
//
//    public void changePrice(String id, BigDecimal newPrice) {
//        var loadedProduct = this.getProductById(id);
//        loadedProduct.changePrice(newPrice);
//    }
//}
