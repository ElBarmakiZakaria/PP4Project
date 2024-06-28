package pl.elbarmaki.ecommerce.catalog;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductCatalogController {

    private final SqlProductStorage catalog;

    public ProductCatalogController(SqlProductStorage catalog) {
        this.catalog = catalog;

    }

//    @GetMapping("/")
//    public String home(){
//        return "index";
//    }


    @PostMapping("/product")
    public Product saveProduct(
            @RequestBody Product product
    ){
        return this.catalog.saveProduct(product);
    }

    @PostMapping("/products")
    public List<Product> saveAllProduct(
            @RequestBody List<Product> products
    ){
        return this.catalog.saveAllProduct(products);
    }

    @GetMapping("/api/products")
    List<Product> allMyProduct() {
        return catalog.findAllProduct();
    }

    @GetMapping("/product/{product_id}")
    Product findProductById(
            @PathVariable("product_id") Integer id
    ) {
        return this.catalog.findProductById(id);
//        return "productpage";
    }


}
