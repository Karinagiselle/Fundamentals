package DesignPatterns.Behavioral;

public abstract class Network {

    public final boolean publish(String msg) {

        if (msg.equals("")) {
            throw new IllegalStateException("Error in message");
        }

        return post(msg);
    }

    public abstract boolean post(String msg);
}
