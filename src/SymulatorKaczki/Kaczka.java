package SymulatorKaczki;

public abstract class Kaczka {

    protected ILatanie latanie;
    protected IKwakanie kwakanie;

//    public void kwacz(){
//        System.out.println("Kwa kwa");
//    }

    public void plywaj(){
        System.out.println("Plywu plywu");
    }


    public void wyswietl(){
        System.out.println("Wyswietlam kaczke");
    }

    public void wykonajLatanie(){
        latanie.lec();
    }

    public void wykonajKwakanie(){
        kwakanie.kwacz();
    }

    public void setKwakanie(IKwakanie kwakanie){
        this.kwakanie = kwakanie;
    }

    public void setLatanie(ILatanie latanie){
        this.latanie = latanie;
    }
    //Reszta metod!

//    public void lec(){
//        System.out.println("Kaczucha lata!");
//    }


}
