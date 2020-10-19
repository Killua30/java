public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"

        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustBeTrue+ " " + mustAlsoBeTrue);
        System.out.println(pair.hashCode()+ " " +pair2.hashCode());
        int[] m =new int[5];
        m[7]= Integer.parseInt(null);

    }
}
