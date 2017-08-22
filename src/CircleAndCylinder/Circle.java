package CircleAndCylinder;

public class Circle {

    private double _radious = 1.0;
    private String _color = "red";


    public Circle(double r){
        _radious = r;
    }

    public Circle() {

    }

    public Circle (double radius, String color){
        _radious = radius;
        _color = color;
    }

    public double get_radious() {
        return _radious;
    }

    public void set_radious(double radius) {
        _radious = radius;
    }

    public String getColor(){
        return _color;
    }

    public void setColor(String color) {
        _color = color;
    }

    public double getArea(){
        return Math.PI * Math.pow(_radious,2d);
    }
    public String toString(){
        return "Circle[radius =" + _radious + ",color =" + _color + "]";
    }
}
