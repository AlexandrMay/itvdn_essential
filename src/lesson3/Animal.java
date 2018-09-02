package lesson3;

public class Animal {

    Animal() {

    }

    private int weight;
    private String brade;

    public Animal(int weight, String brade) {
        this.weight = weight;
        this.brade = brade;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setBrade(String brade) {
        this.brade = brade;
    }

    public int getWeight() {

        return weight;
    }

    public String getBrade() {
        return brade;
    }
}
