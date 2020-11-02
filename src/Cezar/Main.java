package Cezar;

public class Main {

    public static void main(String[] args) {
        CaesarCodec codec = new CaesarCodec(3);
        codec.createAlphabet();
        System.out.println(codec.decode("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        System.out.println(codec.encode("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }
}
