package KlasyAbstrakcyjne;


public class Dziadek extends Emeryt {
    @Override
    public void KrzyczNaDzieci() {
        System.out.printf("Za moich czasow....\n");
    }

    @Override
    public void walczOMiejsceWAutobusie() {
        System.out.printf("Wali laską po noach\n");

    }

    public void zapalPapierosa(){
        System.out.printf("Najlepsze fajeczki to Meskie Mocne!\n");
    }
}
