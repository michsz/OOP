package PointAndCircle;

import org.junit.Assert;
import org.junit.Test;

public class MyPointTest {

    @Test

    public void myPointDefaultGetDistanceToAnotherPoint(){
        MyPoint punkt1 = new MyPoint(0, 0);
        MyPoint punkt2 = new MyPoint(1, 1);

        Assert.assertEquals(1.41, punkt1.distance(punkt2), 0.01);


    }

}
