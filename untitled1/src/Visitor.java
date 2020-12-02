public interface Visitor {
    String visitLaptop  (Laptop laptop);
    String visitMonoblock  (Monoblock monoblock);
    String visitNetbook  (Netbook netbook);
    String visitNettop  (Nettop nettop);
    String visitPC  (PC pc);
    String visitServer  (Server server);


}
