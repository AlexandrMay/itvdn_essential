package lesson3;

public class Main {

    public static void main(String[] args) {
        Cat c = new Cat(5, "vaska", 6, "street");
        Cat c1 = new Cat(1, "barsik", 3, "out");

        System.out.println(c.age + " " + c.name + " " + c.getWeight() + " " + c.getBrade());
        System.out.println(c1.age + " " + c1.name + " " + c1.getWeight() + " " + c1.getBrade());
    }

}
