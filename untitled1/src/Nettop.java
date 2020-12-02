public class Nettop extends Desktop {
    public String accept(Visitor visitor) {
        return visitor.visitNettop(this);
    }
}