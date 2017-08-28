package SymulatorKaczki;

/**
 * Created by RENT on 2017-08-28.
 */
public class Main {
    public static void main(String[] args) {
        Plaskonos pk = new Plaskonos();

//        pk.lec();

//        GumowaKaczka gk = new GumowaKaczka();
//        gk.wyswietl();
//        gk.kwacz();
//        gk.lec();
//
//        Wabik kw = new Wabik();
//        kw.wyswietl();
//        kw.lec();
//        kw.kwacz();


        KaczkaModel km = new KaczkaModel();

        km.wyswietl();
        km.wykonajLatanie();
        km.setLatanie(new LotZNapedemRakietowym());
        km.wykonajLatanie();
    }
}
