package KlasyAbstrakcyjne;

public class Babcia extends Emeryt {

    @Override
    public void KrzyczNaDzieci() {
        System.out.printf("Zostaw ziemniaki, a mieso zjedz!\n");
    }

    @Override
    public void walczOMiejsceWAutobusie() {
        System.out.printf("Wale torbą przez leb\n");
    }
}
