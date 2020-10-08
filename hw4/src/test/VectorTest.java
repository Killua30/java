package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import part1.Vector;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class VectorTest {

    @Test
    public void trylength(){
        Vector vector = new Vector(0,0,1);
        Vector a = new Vector(0,0,0);
        Vector y = new Vector(0.6,0.8,0);
        assertEquals(1,vector.length());
        assertEquals(0,a.length());
        assertEquals(1,y.length());

    }

    @Test
    public void tryscalarProduct(){
        Vector x = new Vector(0,1,0);
        Vector y = new Vector(1,1,0);
        Vector a = new Vector(0,0,0);
        Vector b = new Vector(0.6,0.8,0);
        assertEquals(1,x.scalarProduct(y));
        assertEquals(0,x.scalarProduct(a));
        assertEquals(0.8,x.scalarProduct(b));
        assertEquals(1,b.scalarProduct(b));

    }

    @Test
    public void trycrossProduct(){
        Vector a = new Vector(0,1,0);
        Vector y = new Vector(1,1,0);
        Vector b = new Vector(3,4,0);
        assertEquals(0,a.crossProduct(y).getX());
        assertEquals(0,a.crossProduct(y).getY());
        assertEquals(-1,a.crossProduct(y).getZ());
        assertEquals(0,a.crossProduct(b).getX());
        assertEquals(0,a.crossProduct(b).getY());
        assertEquals(-3,a.crossProduct(b).getZ());
        assertEquals(0,b.crossProduct(b).getX());
        assertEquals(0,b.crossProduct(b).getY());
        assertEquals(0,b.crossProduct(b).getZ());
    }

    @Test
    public void trycos(){
        Vector a = new Vector(1,0,0);
        Vector y = new Vector(0.6,0.8,0);
        Vector b = new Vector(3,4,0);
        assertEquals(0.6,a.cos(y));
        assertEquals(1,b.cos(y));
        assertEquals(1,b.cos(b));


    }
    @Test
    public void  tryadd(){
        Vector a = new Vector(1,0,0);
        Vector y = new Vector(0.6,0.8,0);
        Vector b = new Vector(3,4,5);
        assertEquals(1.6,a.add(y).getX());
        assertEquals(0.8,a.add(y).getY());
        assertEquals(0,a.add(y).getZ());
        assertEquals(3.6,b.add(y).getX());
        assertEquals(4.8,b.add(y).getY());
        assertEquals(5,b.add(y).getZ());
        assertEquals(6,b.add(b).getX());
        assertEquals(8,b.add(b).getY());
        assertEquals(10,b.add(b).getZ());
    }
    @Test
    public void trysubtract(){
        Vector a = new Vector(1,0,0);
        Vector y = new Vector(0.6,0.8,0);
        Vector b = new Vector(3,4,5);
        assertEquals(0.4,a.subtract(y).getX());
        assertEquals(-0.8,a.subtract(y).getY());
        assertEquals(0,a.subtract(y).getZ());
        assertEquals(2.4,b.subtract(y).getX());
        assertEquals(3.2,b.subtract(y).getY());
        assertEquals(5,b.subtract(y).getZ());
        assertEquals(0,b.subtract(b).getX());
        assertEquals(0,b.subtract(b).getY());
        assertEquals(0,b.subtract(b).getZ());
    }


}
