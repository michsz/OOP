package InternetShopCart;

/**
 * Created by RENT on 2017-08-23.
 */
public abstract class MusicCD implements Product {
    protected int _price;
    protected String _name;
    protected String _title;
    protected String _performer;



    @Override
    public int getPrice() {
        return _price;
    }

    @Override
    public void setProductName(String name) {
        _name = name;
    }

    @Override
    public String getProductName() {
        return _name;
    }

    @Override
    public void setPrice(int price) {
        _price = price;
    }

    public String getTitle(){
        return _title;
    }

    public void setTitle(String title){
        _title = title;
    }

    public String getPerformer(){
        return _performer;
    }

    public void setPerformer(String performer){
        _performer = performer;
    }


}
