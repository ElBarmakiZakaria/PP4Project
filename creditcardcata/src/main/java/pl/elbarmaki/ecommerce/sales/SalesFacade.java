package pl.elbarmaki.ecommerce.sales;

import org.springframework.stereotype.Component;

@Component
public class SalesFacade {


    public Offer getCurrentOffer(String customerId) {
        return new Offer();
    }

    public void addProduct(String customerId, String productId) {

    }
}
