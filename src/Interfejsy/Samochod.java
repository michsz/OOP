package Interfejsy;

/**
 * Created by RENT on 2017-08-23.
 */
public class Samochod implements ICzterokolowy {
    @Override
    public void jedź() {
        System.out.printf("Jade!\n");

    }

    @Override
    public void hamuj() {
        System.out.printf("Hamuje!\n");

    }

    @Override
    public void jedzNaCzolowke() {
        System.out.printf("Jade na czolowke\n");

    }
}
