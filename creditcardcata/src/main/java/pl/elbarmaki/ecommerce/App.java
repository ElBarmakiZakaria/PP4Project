package pl.elbarmaki.ecommerce;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.elbarmaki.ecommerce.catalog.JpaProductStorage;
import pl.elbarmaki.ecommerce.catalog.SqlProductStorage;


@SpringBootApplication
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class, args);
    }

//    @Bean
//    SqlProductStorage createSqlProductStorage(JpaProductStorage jpaProductStorage){
//        return null;
//    }
}
