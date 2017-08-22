package PointAndCircle;

/**
 * Created by RENT on 2017-08-21.
 */
public class Main {
    public static void main(String[] args) {

        MyPoint punkt1 = new MyPoint(3, 5);
        MyPoint punkt2 = new MyPoint(1, 10);

        System.out.println(punkt1.getX());
        System.out.println(punkt1.getY());


        System.out.println(punkt1.distance(10,10));
        System.out.println(punkt1.distance(punkt2));
        System.out.println(punkt1.distance());

    }
}
