package main.java.lessons.module_5.lesson_5_7;

import java.io.IOException;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.stream.Collectors;

public class HttpClientTest {
    public static void main(String[] args) throws Exception {
        //HttpUrlConnection
        //HttpClient

        //Apache client
        //Web client
        //OkHttp
        //httpie


        /**
         * Request types:
         * GET: READ
         * POST: CREATE
         * PUT: UPDATE
         * DELETE
         * PATCH
         */

        /**
         * Response:
         * code: 200-299: success, 300-399 redirect, 400-499 client error, 500-599 server error
         * message:
         * data:
         */


        /**
         * Path variable: kun.uz/{id} (GET,DELETE)
         * Path params: (GET)
         * Body: (POST,PUT)
         * Header:
         */



    }

    private static void getWithParamsAndAuth() throws URISyntaxException, IOException, InterruptedException {
        //get with params
        String url="http://localhost:8082/trainees";
        Map<String,String> paramsMap=Map.of("username","utkirbek","password","123");
        String params = paramsMap.entrySet().stream()
                .map((e) -> {
                    return e.getKey() + "=" + e.getValue();
                })
                .collect(Collectors.joining("&"));


        HttpClient client= HttpClient.newBuilder()
                .build();

        String usernamePassword="utkirbek9:EbzYlQYCRb";

        HttpRequest request= HttpRequest.newBuilder()
                .uri(new URI(url+"?"+params))
                .header("Authorization","Basic "+ new String(Base64.getEncoder().encode(usernamePassword.getBytes())))
                .GET()
                .build();


        HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("send = " + send);
        System.out.println("send.body() = " + send.body());
    }

    private static void deleteREquest() throws URISyntaxException, IOException, InterruptedException {
        URI uri=new URI("http://localhost:8082/trainees?username=utkirbek9");


        HttpClient client= HttpClient.newBuilder().build();

        HttpRequest request= HttpRequest.newBuilder()
                .header("Content-Type","application/json")
                .uri(uri)
                .DELETE()
                .build();

        HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(send);
    }

    private static void putREqquest() throws URISyntaxException, IOException, InterruptedException {
        String bodyStr="{\n" +
                "    \"username\":\"utkirbek9\",\n" +
                "    \"firstName\":\"Utkirbek\",\n" +
                "    \"lastName\":\"Qutfiddinov\",\n" +
                "    \"isActive\":true,\n" +
                "    \"birthDate\":\"1998-06-14\",\n" +
                "    \"address\":\"Namangan\"\n" +
                "}";

        HttpRequest.BodyPublisher body= HttpRequest.BodyPublishers.ofString(bodyStr);

        HttpClient client= HttpClient.newBuilder().build();

        String url="http://localhost:8082/trainees";


        HttpRequest request= HttpRequest.newBuilder()
                .header("Content-Type","application/json")
                .uri(new URI(url))
                .PUT(body)
                .build();

        HttpResponse<String> send = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(send);
    }

    private static void simplePostMapping() throws URISyntaxException, IOException, InterruptedException {
        HttpClient client= HttpClient.newBuilder().build();

        String url="http://localhost:8082/trainees";

        String json="{\n" +
                "    \"firstName\":\"utkir\",\n" +
                "    \"lastName\":\"bek\"\n" +
                "}";

        HttpRequest.BodyPublisher body= HttpRequest.BodyPublishers.ofString(json);

        HttpRequest request= HttpRequest.newBuilder()
                .uri(new URI(url))
                .header("Content-Type","application/json")
                .POST(body)
                .build();

        HttpResponse<String> resp = client.send(request, HttpResponse.BodyHandlers.ofString());

        String respbody = resp.body();

        System.out.println(respbody);
    }

    private static void simpleGetRequest() throws URISyntaxException, IOException, InterruptedException {
        HttpClient client= HttpClient.newBuilder().build();

            String url="https://cbu.uz/uz/arkhiv-kursov-valyut/json/";

        HttpRequest request= HttpRequest.newBuilder()
                .uri(new URI(url))
                .GET()
                .build();

        HttpResponse<String> resp = client.send(request, HttpResponse.BodyHandlers.ofString());

        String body = resp.body();

        System.out.println(body);
    }
}
