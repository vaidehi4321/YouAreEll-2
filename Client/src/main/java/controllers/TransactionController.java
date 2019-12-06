package controllers;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class TransactionController {
    private String rootURL = "http://zipcode.rocks:8085";

    public TransactionController() {}


    public String makeURLCall(String endPoint, String method, String jpayload) {
        HttpResponse<JsonNode> jsonResponse = Unirest.get(rootURL+endPoint)
                .header("accept", "application/json")
                .asJson();
        return jsonResponse.getBody().toString();
    }
}
