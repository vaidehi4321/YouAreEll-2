package controllers;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import models.Id;
import models.Message;

public class MessageController {
TransactionController transactionController = new TransactionController();
    private HashSet<Message> messagesSeen;
    // why a HashSet??

    public ArrayList<Message> getMessages() {
        String messages = transactionController.makeURLCall("/messages", "GET", "");
        Type listType = new TypeToken<List<Message>>(){}.getType();
        return new Gson().fromJson(messages, listType);

    }
    public ArrayList<Message> getMessagesForId(Id Id) {

        return null;
    }
    public Message getMessageForSequence(String seq) {
return null;

    }
    public ArrayList<Message> getMessagesFromFriend(Id myId, Id friendId) {
        return null;
    }

    public Message postMessage(Id myId, Id toId, Message msg) {
        return null;
    }
 
}