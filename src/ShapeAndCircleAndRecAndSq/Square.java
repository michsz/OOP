package ShapeAndCircleAndRecAndSq;


public class Square extends Rectangle {
    public Square(){}
    public Square(double side){
        super(side,side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return getLenght();
    }

    public void setSide(double side){
        setLenght(side);
        setWidth(side);
    }

    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLenght(side);
    }

    @Override
    public void setLenght(double side){
        super.setWidth(side);
        super.setLenght(side);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("A Rectangle with side = ")
                .append(getSide())
                .append(" which is a subclass of ")
                .append(super.toString());

        return sb.toString();
    }


}
