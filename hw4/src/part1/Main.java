package part1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        File file = new File("file.txt");
        Vector x = new Vector(1.23,5.62,-5.1346);
        try (ObjectOutputStream cout = new ObjectOutputStream(new FileOutputStream(file));
             ObjectInputStream cin = new ObjectInputStream(new FileInputStream(file))) {

             cout.writeObject(x);
             Vector deserializedVector = (Vector) cin.readObject();
            Vector y = new Vector(0,0,0);
            System.out.println("Начальные координаты вектора: " + y.x + " " +y.y + " " + y.z + ".");
            System.out.println("Координаты вектора, если он подрастет: " + deserializedVector.x + " " +deserializedVector.y + " " + deserializedVector.z + ".");

            y = deserializedVector;
            System.out.println("Вектор подрос и его координаты стали: " +y.x + " " +y.y + " " + y.z + "!!!");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
