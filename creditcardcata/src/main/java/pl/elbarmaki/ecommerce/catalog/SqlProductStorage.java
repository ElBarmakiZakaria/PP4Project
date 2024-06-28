package pl.elbarmaki.ecommerce.catalog;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class SqlProductStorage implements ProductStorage {

    private final JpaProductStorage repository;

    public SqlProductStorage(JpaProductStorage repository) {
        this.repository = repository;
    }

    public Product saveProduct(Product product){
        repository.save(product);

        return product;
    }

    public List<Product> saveAllProduct(List<Product> products){
        repository.saveAll(products);
        return products;
    }

    public List<Product> findAllProduct(){
        var products = repository.findAll();
        return products;
    }

    public Product findProductById(Integer id) {
        var product = repository.findById(id)
                .orElse(new Product());

        return product;
    }


    @Override
    public List<Product> allProducts() {
        var products = repository.findAll();
        return products;
    }

    @Override
    public Product add(Product newProduct) {
        repository.save(newProduct);
        return newProduct;

    }

    @Override
    public Product getProductBy(Integer id) {
        var product = repository.findById(id)
                .orElse(new Product());

        return product;
    }
}
