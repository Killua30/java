package javadoc;

import java.io.Serializable;
/**
 * Класс вектора в трехмерном пространстве
 * @author Killua30
 * @version 1.0
 */

public class Vector implements Serializable {
    /**
     * Fields that store coordinates of the vector
     */
    double x;
    double y;
    double z;

    /**
     * This is constructor
     * @param x vector's first coordinate
     * @param y vector's second coordinate
     * @param z vector's third coordinate
     * @since 1.0
     */
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     *
     * @return length
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     *
     * @param b the second vector
     * @return scalar product of vectors
     */
    public double scalarProduct(Vector b) {
        return x * b.x + y * b.y + z * b.z;
    }

    /**
     *
     * @param b the second vector
     * @return cross product of vectors
     */

    public Vector crossProduct(Vector b) {
        Vector q = new Vector(0.0D, 0.0D, 0.0D);
        q.x = y * b.z - z * b.y;
        q.y = z * b.x - x * b.z;
        q.z = x * b.y - y * b.x;
        return q;
    }

    /**
     *
     * @param b the second vector
     * @return cos of vectors
     */
    public double cos(Vector b) {
        return scalarProduct(b) / (length() * b.length());
    }

    /**
     *
     * @param b the second vector
     * @return sum of vectors
     */

    public Vector add(Vector b) {
        Vector q = new Vector(0.0D, 0.0D, 0.0D);
        q.x = x + b.x;
        q.y = y + b.y;
        q.z = z + b.z;
        return q;
    }

    /**
     *
     * @param b the second vector
     * @return difference betwen vectors
     */
    public Vector subtract(Vector b) {
        Vector q = new Vector(0.0D, 0.0D, 0.0D);
        q.x = x - b.x;
        q.y = y - b.y;
        q.z = z - b.z;
        return q;
    }

    /**
     *
     * @return vector's first coordinate
     */
    public double getX() {
        return x;
    }
    /**
     *
     * @return vector's second coordinate
     */
    public double getY() {
        return y;
    }
    /**
     *
     * @return vector's third coordinate
     */
    public double getZ() {
        return z;
    }
}
