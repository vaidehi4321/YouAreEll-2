package models;

/* 
 * POJO for an Message object
 */
public class Message {
    private String sequence;
    private String timestamp;
    private String fromid;
    private String toid;
    private String message;

    public Message (String message, String fromid, String toid) {
        this.message = message;
        this.fromid =fromid;
        this.toid = toid;
    }

    public String getFromid() {
        return fromid;
    }

    public String getToid() {
        return toid;
    }

    public String getMessage() {
        return message;
    }

    public void setFromid(String fromid) {
        this.fromid = fromid;
    }

    public void setToid(String toid) {
        this.toid = toid;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSequence() {
        return sequence;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}