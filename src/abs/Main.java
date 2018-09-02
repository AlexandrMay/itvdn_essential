package abs;

public class Main {
    public static void main(String[] args) {
//        Bird b  = new Bird();

        Bird p = new Penguin();
        Bird s = new Strauss();
        Bird sw = new Swallow();

        p.move();
        s.move();
        sw.move();
    }

}
