package AdvancedProgramming;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getXYZ() {
        float[] a = {getX(), getY(), this.z};
        return a[0] + a[1] + a[2];
    }

    public void setXYZ(float x, float y, float z) {
        float[] a = {getX(), getY(), this.z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                '}' + super.toString();
    }
}
