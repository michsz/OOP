package StacjaPogodowa;

/**
 * Created by RENT on 2017-08-29.
 */
public interface IPodmiot {

    void zarejestrujObserwatora(IObserwator obserwator);
    void usunObserwatora(IObserwator obserwator);
    void powiadomObserwatorow();
}
