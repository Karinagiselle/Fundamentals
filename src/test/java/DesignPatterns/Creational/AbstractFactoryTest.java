package DesignPatterns.Creational;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AbstractFactoryTest {

    @Test
    public void createIphone() {
        PhoneFactory phoneFactory = PhoneFactory.getFactory(PhoneCompany.IPHONE);

        Glass glass = phoneFactory.createGlass();
        PhoneButton button = phoneFactory.createButton();

        assertThat(glass).isInstanceOf(IphoneGlass.class);
        assertThat(glass.getGlassType()).isEqualTo("Iphone Glass");
        assertThat(button).isInstanceOf(IphoneButton.class);
        assertThat(button.getButtonType()).isEqualTo("Iphone Button");
    }

    @Test
    public void createSamsung() {
        PhoneFactory phoneFactory = PhoneFactory.getFactory(PhoneCompany.SAMSUNG);

        Glass glass = phoneFactory.createGlass();
        PhoneButton button = phoneFactory.createButton();

        assertThat(glass).isInstanceOf(SamsungGlass.class);
        assertThat(glass.getGlassType()).isEqualTo("Samsung Glass");
        assertThat(button).isInstanceOf(SamsungButton.class);
        assertThat(button.getButtonType()).isEqualTo("Samsung Button");
    }
}
