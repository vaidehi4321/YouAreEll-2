package controllers;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import models.Id;

public class IdController {
    Id myId;
TransactionController transactionController = new TransactionController();
    public String getIds() {
        return transactionController.makeURLCall("/ids","GET","");

    }
    public ArrayList<Id>parseId(String payLoad){
        Type listType = new TypeToken<List<Id>>() {}.getType();
        return new Gson().fromJson(payLoad, listType);
    }

    public Id postId(Id id) {
return null;
    }

    public Id putId(Id id) {
        return null;
    }
 
}