package ShapeAndCircleAndRecAndSq;

/**
 * Created by RENT on 2017-08-22.
 */
public class Rectangle extends Shape {
    private double _width = 1.0;
    private double _lenght = 1.0;

    public Rectangle(){}
    public Rectangle(double width, double length) {
        _width = width;
        _lenght = length;
    }
    public Rectangle (double width, double lenght, String color, boolean filled){
        super(color, filled);
        _width = width;
        _lenght = lenght;
    }

    public double getWidth() {
        return _width;
    }
    public void setWidth(double width){
        _width = width;
    }
    public double getLenght(){
        return _lenght;
    }
    public void setLenght(double lenght){
        _lenght = lenght;
    }

    public double getArea(){return _lenght*_width;}
    public double getPerimeter(){
        return 2*_lenght + 2*_width;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("A Rectangle with width = ")
                .append(_width)
                .append(" and lenght = ")
                .append(_lenght)
                .append(" which is a subclass of ")
                .append(super.toString());

        return sb.toString();
    }

}
