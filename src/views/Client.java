package views;

import model.Facebook;
import model.LinkedIn;
import model.SocialMediaFacade;
import model.Twitter;

public class Client {
    public void share(String message){
        SocialMediaFacade socialMediaFacade = new SocialMediaFacade(new Twitter(), new Facebook(), new LinkedIn());
        socialMediaFacade.share(message);
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.share("gửi đi tất cả muôn nơi");
    }
}
