package DesignPatterns.Behavioral;

public class Twitter extends Network {

    private User user;

    Twitter(User user) {
        this.user = user;
    }

    public boolean post(String msg) {
        System.out.println("Message posted in Twitter account");
        return true;
    }
}
