package StacjaPogodowa;

/**
 * Created by RENT on 2017-08-29.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException{
        DanePogodowe dp = new DanePogodowe();
        WarunkiBiezaca wb = new WarunkiBiezaca(dp);

        dp.ustawZmienne(11, 1030, 45);

        Thread.sleep(10000);

        dp.ustawZmienne(13, 1033, 50);
    }
}
