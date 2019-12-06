package youareell;

import controllers.*;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class YouAreEll {

    private MessageController msgCtrl;
    private IdController idCtrl;
    private String mainURL="http://zipcode.rocks:8085";

    public YouAreEll (MessageController m, IdController j) {
        // used j because i seems awkward
        this.msgCtrl = m;
        this.idCtrl = j;
    }

    public static void main(String[] args) {
        // hmm: is this Dependency Injection?
        YouAreEll urlhandler = new YouAreEll(new MessageController(), new IdController());
        System.out.println(urlhandler.MakeURLCall("/ids", "GET", ""));
        System.out.println(urlhandler.MakeURLCall("/messages", "GET", ""));
    }

    public String get_ids() {
        return MakeURLCall("/ids", "GET", "");
    }

    public String get_messages() {
        return MakeURLCall("/messages", "GET", "");
    }

    public String MakeURLCall(String endPoint, String method, String jpayload) {
        HttpResponse<JsonNode> jsonResponse = Unirest.get(mainURL+endPoint)
                .header("accept", "application/json")
                .asJson();
        return jsonResponse.getBody().toString();
    }
}
