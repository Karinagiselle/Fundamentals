package DesignPatterns.Behavioral;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TemplateMethodTest {

    @Test
    public void postInFacebook() {

        Network facebook = new Facebook(new User("karinaBlanco"));

        String message = "Good morning!";
        boolean result = facebook.publish(message);

        assertThat(result).isTrue();
    }

    @Test(expected = IllegalStateException.class)
    public void postInFacebookFail() {

        Network facebook = new Facebook(new User("karinaBlanco"));

        facebook.publish("");
    }

    @Test
    public void postInTwitter() {

        Network twitter = new Twitter(new User("karinaBlanco"));

        String message = "Good morning!";
        boolean result = twitter.publish(message);

        assertThat(result).isTrue();
    }

    @Test(expected = IllegalStateException.class)
    public void postInTwitterFail() {

        Network twitter = new Twitter(new User("karinaBlanco"));

        twitter.publish("");
    }
}
