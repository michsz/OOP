package Interfejsy;

/**
 * Created by RENT on 2017-08-23.
 */
public class Main {
    public static void main(String[] args) {
        ICzterokolowy samochod1 = new Samochod();

        samochod1.jedzNaCzolowke();

        IDwukolowy motocykl1 = new Motocykl();

        motocykl1.przewrocSie();

    }
}
