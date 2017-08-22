package Point2d3d;

/**
 * Created by RENT on 2017-08-22.
 */
public class Point2D {
    private float _x = 0.0f;
    private float _y = 0.0f;

    public Point2D(){

    }

    public Point2D(float x, float y){
        _x = x;
        _y = y;
    }



    public float getX(){
        return _x;
    }
    public void setX(int x){
        _x = x;
    }
    public float getY(){
        return _y;
    }
    public void setY(int y){
        _y = y;
    }

    public float[] getXY(){
        float[] tab = new float[2];
        tab[0] = _x;
        tab[1] = _y;

        return tab;
    }

    public void setXY(float x, float y){
        _x = x;
        _y = y;
    }

    public String toString(){
        return String.format("(%s, %s)", _x, _y);
    }

}
