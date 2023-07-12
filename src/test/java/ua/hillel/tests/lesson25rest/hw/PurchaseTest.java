package ua.hillel.tests.lesson25rest.hw;
import org.testng.Assert;
import org.testng.annotations.Test;
import ua.hillel.automation.java.rest25.hw.Store;
import ua.hillel.automation.java.rest25.hw.entities.Order;
import java.io.IOException;

public class PurchaseTest {
    @Test
    public void purchaseTest() throws IOException {

        Store store = new Store();
        //create orderFromRequest
        Order orderFromRequest = new Order();
        orderFromRequest.setId(111);
        orderFromRequest.setQuantity(2);
        orderFromRequest.setPetId(198772);
        orderFromRequest.setShipDate("2023-07-11T21:26:13.268Z");
        orderFromRequest.setStatus("approved");
        orderFromRequest.setComplete(true);

        Order orderFromResponse = store.placeOrder(orderFromRequest);
        //System.out.println(orderFromResponse.toString());
        Assert.assertEquals(orderFromRequest,orderFromRequest,"Order from request not equal to order in response");

        store.findOrder(111);


        store.deleteOrder(1);
    }
}
