package  vectorr;
public class main {
public static void main(String[]args){
        Vector a=new Vector(1.1,2.2,3.3);
        Vector b=new Vector(1.5,2.5,3.5);
        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(a.scalarProduct(b));
        System.out.println(a.crossProduct(b));
        System.out.println(a.cos(b));
        System.out.println((a.add(b)).x);
        System.out.println(a.subtract(b).x);


        }
        }