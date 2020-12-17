public class Laptop extends PortComp {
    public String accept(Visitor visitor) {
        return visitor.visitLaptop(this);
    }
}