package inter;

public interface ITest {

    int PRICE = 10;

    void move1();

    static int sum() {
        return 10 + 5;
    }

    default int mul() {
        return PRICE * 10;
    }

}
