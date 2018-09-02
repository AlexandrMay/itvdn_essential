package lesson3.poly;

public class Main {

    public static void main(String[] args) {
        Bird s = new Straus();
        Bird p = new Penguin();
        Bird sw = new Swallow();
        Bird[] arr = {s, p, sw};
        for (Bird temp: arr) {
            temp.move();
        }
    }

}
