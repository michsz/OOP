package Point2d3d;

/**
 * Created by RENT on 2017-08-22.
 */
public class Point3D extends Point2D {
    private float _z = 0.0f;

    Point3D(){
        super();
    }

    Point3D(float x, float y, float z){
        super(x, y);
        _z = z;
    }

    public float getZ(){return _z;}
    public void setZ(float z) {_z = z;}

    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        _z = z;

    }

    public float[] getXYZ(){
        float[] tab = new float[3];
        tab[0] = getX();
        tab[1] = getY();
        tab[2] = getZ();

        return tab;
    }

    public String toString(){
        return String.format("(%s, %s, z)", getX(), getY(), _z);
    }
}
