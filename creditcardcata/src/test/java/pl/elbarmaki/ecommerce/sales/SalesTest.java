package pl.elbarmaki.ecommerce.sales;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class SalesTest {


    @Test
    void itShowsCurrentOffer(){
        String customerId = thereIsCustomer("Kuba");
        SalesFacade sales = thereIsSalesFacade();

        Offer currentOffer = sales.getCurrentOffer(customerId);

        assertEquals(BigDecimal.ZERO, currentOffer.getTotal());
        assertEquals(0, currentOffer.getItemCount());
    }

    private SalesFacade thereIsSalesFacade() {
        return new SalesFacade(

        );
    }

    private String thereIsCustomer(String id) {
        return id;
    }

    @Test
    void ItAllowsToAddProdcuts(){

        String customerId = thereIsCustomer("Kuba");
        SalesFacade sales = thereIsSalesFacade();
        String productId = thereIsProduct("Product X", BigDecimal.valueOf(10.10));

        sales.addProduct(customerId, productId);
        Offer currentOffer = sales.getCurrentOffer(customerId);

        assertEquals(BigDecimal.ZERO, currentOffer.getTotal());
        assertEquals(0, currentOffer.getItemCount());

    }

    private String thereIsProduct(String productX, BigDecimal bigDecimal) {
        return null;
    }

    @Test
    void itAllowsToAcceptOffer(){

    }





}
