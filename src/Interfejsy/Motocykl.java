package Interfejsy;


public class Motocykl implements IDwukolowy {
    @Override
    public void jedź() {
        System.out.printf("Jade!\n");

    }

    @Override
    public void hamuj() {
        System.out.printf("Hamuje!\n");

    }

    @Override
    public void przewrocSie() {
        System.out.printf("Przewracam sie!");
    }

    public void dodajGazu() {
        System.out.printf("Dodaje gazu!");
    }
}
