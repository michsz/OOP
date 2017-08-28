package KlasyAbstrakcyjne;


public abstract class Emeryt {
    public static final int ILOSC_OCZODOLOW = 2;
    public abstract void KrzyczNaDzieci();

    public  abstract  void walczOMiejsceWAutobusie();

    public void biegnijDoSklepu(int odleglosc, int predkosc){
        double czas = (double)odleglosc/predkosc;
        System.out.println("Biegne po kielbe bede za " +czas);
    }

    public static void glupiaMetoda(){

    }
}
