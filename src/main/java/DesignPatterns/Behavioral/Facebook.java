package DesignPatterns.Behavioral;

public class Facebook extends Network {

    private User user;

    Facebook(User user) {
        this.user = user;
    }

    public boolean post(String msg) {
        System.out.println("Message posted in Facebook account");
        return true;
    }
}
