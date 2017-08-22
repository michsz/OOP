package CircleAndCylinder;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.notification.RunListener;

public class CircleAndCylinderTest {
    @Test
    public void getDefaultCircleRadius(){
        Circle circle = new Circle();
        Assert.assertEquals(1.0, circle.get_radious(), 0.1);
    }

    @Test
    public void getRadiusCircleRadius (){
        Circle circle = new Circle(2.0);
        Assert.assertEquals(2.0, circle.get_radious(), 0.1);
    }

    @Test
    public void getAndSetCircleRadiusAndColor(){
        Circle circle = new Circle(3.0, "red");
        Assert.assertEquals(3.0, circle.get_radious(), 0.1);
        Assert.assertEquals("red", circle.getColor());
        circle.set_radious(4.0);
        circle.setColor("magneta");
        Assert.assertEquals(4.0, circle.get_radious(), 0.1);
        Assert.assertEquals("magneta", circle.getColor());
    }

    @Test
    public void getCircleAreaForAllConstructors(){
        Circle circle = new Circle();
        Circle circle2 = new Circle(2.0);
        Circle circle3 = new Circle(3.0, "red");
        Assert.assertEquals(3.14, circle.getArea(), 0.01);

    }
}
