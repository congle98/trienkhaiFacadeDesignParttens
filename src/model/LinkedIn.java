package model;

public class LinkedIn implements SocialShare {
    private String message;
    public void setMessage(String message) {
        this.message = message;
    }

    public void share() {
        System.out.println("Sharing to LinkedIn: " + this.message);
    }
}
