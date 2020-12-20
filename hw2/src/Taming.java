@FunctionalInterface
public interface Taming<T,U, R> {
    R tame (T strayPet, U owner);
}
