package abs;

public abstract class Bird implements Creator{

   public void live() {
        System.out.println("i can live");
    }

    public abstract void move();

    public void eat() {
        System.out.println("eat");
    }

}
