public class Netbook extends PortComp {
    public String accept(Visitor visitor) {
        return visitor.visitNetbook(this);
    }
}