public class HomePet {
    String name;
    int age;
    String owner;

    public HomePet(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    public static void main(String[] args){
        Taming<StrayPet,String, HomePet> tamer = (strayPet, owner1) -> new HomePet(strayPet.name, strayPet.age, owner1);
        StrayPet pet1 = new StrayPet("Barsik",14);
        HomePet pet2 = tamer.tame(pet1,"Vanya");
        System.out.println(pet2.name +" " + pet2.age + " " + pet2.owner);
    }

}
