package StacjaPogodowa;

/**
 * Created by RENT on 2017-08-29.
 */
public class WarunkiBiezaca implements IWyswietl, IObserwator {
    private float _temp;
    private float _cisnienie;
    private float _wilgotnosc;
    private IPodmiot _danePogodowe;

    WarunkiBiezaca(IPodmiot danePogodowe){
        _danePogodowe = danePogodowe;
        _danePogodowe.zarejestrujObserwatora(this);
    }

    @Override
    public void wyswietl() {
        System.out.printf("Aktualne dane %f stC, %fhPA, %f %%\n", _temp, _cisnienie, _wilgotnosc);
    }

    @Override
    public void aktualizuj(float temp, float cisnienie, float wilgotnosc) {
        _cisnienie = cisnienie;
        _temp = temp;
        _wilgotnosc = wilgotnosc;
        wyswietl();
    }
}
