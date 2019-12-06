package models;

/* 
 * POJO for an Id object
 */
public class Id {
private String userid;
private String name;
private String githubId;
    
    public Id (String name, String githubId) {
        this.name = name;
        this.githubId = githubId;
    }

    public String getName() {
        return name;
    }

    public String getGithub() {
        return githubId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGithub(String githubId) {
        this.githubId = githubId;
    }

}