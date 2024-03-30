package pl.elbarmaki.ecommerce;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.elbarmaki.ecommerce.catalog.ProductCatalog;

@SpringBootApplication
public class App {
    public static void main(String[] args){
        System.out.println("here we go!!!");
        SpringApplication.run(App.class, args);
    }


    @Bean
    ProductCatalog createMyCatalog(){
        var catalog = new ProductCatalog();
        catalog.addProduct("lego set 8032", "nice one");
        catalog.addProduct("cubi blocks", "nice one");

        return catalog;
    }
}
