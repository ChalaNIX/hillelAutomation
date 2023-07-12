package ua.hillel.automation.java.rest25.hw;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import ua.hillel.automation.java.rest25.entities.Post;
import ua.hillel.automation.java.rest25.hw.entities.Order;
//
import java.io.IOException;

public class Store {

    //повертає ордер
    public  Order placeOrder(Order order) throws IOException {
        Gson gson = new Gson();
        RequestBody requestBody = RequestBody.create(gson.toJson(order).toString().getBytes());

        Request request = new Request.Builder()
                .url("https://petstore3.swagger.io/api/v3/store/order")
                .post(requestBody)
                .header("Content-type","application/json")
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        //System.out.println(response.body().string());
        Order newOrder = gson.fromJson(response.body().string(), Order.class);
        return newOrder;
    }

    //повертає ордер
    public void findOrder(int id) throws IOException {
        Request request = new Request.Builder()
                .url("https://petstore3.swagger.io/api/v3/store/order/"+id)
                .get()
                .header("Content-type","application/json")
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        System.out.println(response.body().string());
    }

    //повертає ордер
    public void deleteOrder(int id) throws IOException {
        Request request = new Request.Builder()
                .url("https://petstore3.swagger.io/api/v3/store/order/"+id)
                .delete()
                .header("Content-type","application/json")
                .build();
        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();
        //System.out.println(response.body().string());
        System.out.println(response.code());
    }
}
