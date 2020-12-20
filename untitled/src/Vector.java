public class Vector {
    double x;
    double y;
    double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length () {
        return Math.sqrt(x * x + y * y + z * z);
    }

    double scalarProduct(Vector b) {
        return x * b.x + y * b.y + z * b.z;
    }

    Vector crossProduct( Vector b) {
        Vector q = new Vector(0.0D, 0.0D, 0.0D);
        q.x = y * b.z - z * b.y;
        q.y = z * b.x - x * b.z;
        q.z = x * b.y - y * b.x;
        return q;
    }

    double cos( Vector b) {
        return scalarProduct(b) / (length() * b.length());
    }

    Vector add( Vector b) {
        Vector q = new Vector(0.0D, 0.0D, 0.0D);
        q.x = x + b.x;
        q.y = y + b.y;
        q.z = z + b.z;
        return q;
    }

    Vector subtract(Vector b) {
        Vector q = new Vector(0.0D, 0.0D, 0.0D);
        q.x = x - b.x;
        q.y = y - b.y;
        q.z = z - b.z;
        return q;
    }

}
