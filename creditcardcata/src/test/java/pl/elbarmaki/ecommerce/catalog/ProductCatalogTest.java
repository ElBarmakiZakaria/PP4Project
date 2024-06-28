//package pl.elbarmaki.ecommerce.catalog;
//
//
//import org.junit.jupiter.api.Test;
//import pl.elbarmaki.ecommerce.catalog.Product;
//import pl.elbarmaki.ecommerce.catalog.ProductCatalog;
//
//import static org.assertj.core.api.Assertions.*;
//
//import java.math.BigDecimal;
//import java.util.List;
//
//public class ProductCatalogTest {
//
//    @Test
//    void itListAvailableProducts() {
//        ProductCatalog catalog = thereIsProductCatalog();
//
//        List<Product> products = catalog.allProducts();
//
//        assert products.isEmpty();
//    }
//
//
//
//    @Test
//    void itAllowsToAddProduct() {
//        ProductCatalog catalog = thereIsProductCatalog();
//
//        catalog.addProduct("Lego set 8083", "Nice one", "kjkj");
//        List<Product> products = catalog.allProducts();
//
//        assertThat(products)
//                .hasSize(1);
//    }
//
//    @Test
//    void itLoadsSingleProductById() {
//        ProductCatalog catalog = thereIsProductCatalog();
//        String id = catalog.addProduct("Lego set 8083", "Nice one", "kjkj");
//
//        Product loaded = catalog.getProductById(id);
//
//        assertThat(id).isEqualTo(loaded.getId());
//    }
//
//    @Test
//    void itAllowsChangePrice() {
//        ProductCatalog catalog = thereIsProductCatalog();
//        String id = catalog.addProduct("Lego set 8083", "Nice one", "kjkj");
//
//        catalog.changePrice(id, BigDecimal.valueOf(10.10));
//        Product loaded = catalog.getProductById(id);
//
//        assertThat(BigDecimal.valueOf(10.10)).isEqualTo(loaded.getPrice());
//    }
//
//    private static ProductCatalog thereIsProductCatalog() {
//        return new ProductCatalog(new ArrayListProductStorage());
//    }
//}