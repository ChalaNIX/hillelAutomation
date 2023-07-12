package ua.hillel.automation.java.rest25;
import com.google.gson.Gson;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;
import ua.hillel.automation.java.rest25.entities.Post;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

//import org.openqa.selenium.devtools.v85.network.model.Request;

//використовуєм клієнт - бібілітеку okttp (додана як залежність)
//так як до сервісу немає документації - можна перевіряти в Postman що ми маємо отримати

//JSON in JAVA - бібліотека, підключається через mvn,для роботи з JSON структурою запитів

//серилізація - десерилізація(бібліотека Gson)
public class PostControler {
    public void getAllPosts() throws IOException {
        Request request = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts/")
                .get()
                .build();

        //об'єкт, який буде відправляти реквест
        OkHttpClient client = new OkHttpClient();

        //надсилаєм реквест і одразу зберігаємо відповідь
        Response response = client.newCall(request).execute();

        //дістати статус код респонса
        System.out.println(response.code());

        System.out.println(response.body().string());

    }
    public void getPostById(int id) throws IOException {
        Request request = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts/"+id)
                .get()
                .build();


        OkHttpClient client = new OkHttpClient();

        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.body().string());
    }
    //поле id можна було не передавати - сервіс автоматично ставить id=101
    public void createNewPost() throws IOException {
        String bodyString = "{\n" +
                "  \"userId\": 1,\n" +
                "  \"id\": 1,\n" +
                "  \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n" +
                "  \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n" +
                "}";

        RequestBody body = RequestBody.create(bodyString.getBytes());
        //RequestBody.create(bodyString,MediaType.parse("application/json")); - другий варіант

        Request request = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts/")
                .post(body)
                .header("Content-type","application/json")  //якщо є body - має бути header з поясненням яку інфу ми передаєм
                .build();


        OkHttpClient client = new OkHttpClient();

        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        System.out.println(response.body().string());

    }
    public void createNewPostWithJson(String title,String body) throws IOException {
        JSONObject json = new JSONObject();
        json.put("userId",1);
        json.put("title",title);
        json.put("body",body);

        RequestBody requestBody = RequestBody.create(json.toString().getBytes());

        Request request = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts/")
                .post(requestBody)
                .header("Content-type","application/json")  //якщо є body - має бути header з поясненням яку інфу ми передаєм
                .build();


        OkHttpClient client = new OkHttpClient();

        Response response = client.newCall(request).execute();

        System.out.println(response.code());
        //System.out.println(response.body().string());

        JSONObject responseJson = new JSONObject(response.body().string());

        System.out.printf("Response title: %s, response body: %s%n",
                responseJson.get("title"),responseJson.get("body"));

        //JSONArray - як в звичайний масив додаються данні
        //JSONArray jsonArray = new JSONArray();
        //jsonArray.put()
    }

    public Post createPostWithGson(Post post) throws IOException {
        Gson gson = new Gson();
        RequestBody requestBody = RequestBody.create(gson.toJson(post).toString().getBytes());

        Request request = new Request.Builder()
                .url("https://jsonplaceholder.typicode.com/posts/")
                .post(requestBody)
                .header("Content-type","application/json")  //якщо є body - має бути header з поясненням яку інфу ми передаєм
                .build();

        OkHttpClient client = new OkHttpClient();
        Response response = client.newCall(request).execute();

        //System.out.println(response.body().string());

        Post newPost = gson.fromJson(response.body().string(), Post.class); //Post.class - в який саме об'єкт треба перевести
        return newPost;
    }












}
