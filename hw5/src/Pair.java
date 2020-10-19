import java.util.Objects;
import java.util.Optional;

public class Pair <T, S> {
    private T firstValue;
    private S secondValue;

    public T getFirst() {
        return firstValue;
    }

    public S getSecond() {
        return secondValue;
    }

    public void setFirstValue(T firstValue) {
        this.firstValue =firstValue;
    }

    public void setSecondValue(S secondValue) {
        this.secondValue = secondValue;
    }
    private Pair(T firstValue, S secondValue) {

        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }
    public static <T,S> Pair<T,S> of(T firstValue, S secondValue){

        return new Pair(firstValue, secondValue);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(firstValue, pair.firstValue) &&
                Objects.equals(secondValue, pair.secondValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstValue, secondValue);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstValue=" + firstValue +
                ", secondValue=" + secondValue +
                '}';
    }
}
