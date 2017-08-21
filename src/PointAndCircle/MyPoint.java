package PointAndCircle;

/**
 * Created by RENT on 2017-08-21.
 */
public class MyPoint {
    private int _x = 0;
    private int _y = 0;

    public MyPoint(){
        _x = 0;
        _y = 0;
    }

    public MyPoint(int x, int y){
        _x = x;
        _y = y;
    }

    public int getX(){
        return _x;
    }

    public void setX(int x){
        _x = x;
    }

    public int getY(){
        return _y;
    }
    public void setY(int y){
        _y = y;
    }

    public int[] getXY(){
        int[] tab = new int[2];
        tab[0] = _x;
        tab[1] = _y;

        return tab;
    }

    public void setXY (int x, int y){
        _x = x;
        _y = y;
    }

    public String toString(){
        return String.format("Punkt (%s, %s]", _x, _y);
    }

    public double distance(int x, int y){

    }




}
