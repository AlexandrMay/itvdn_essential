package anonim;

public class Mobile extends Computer{
    Phone createPhone() {
        return new Phone() {
            @Override
            void process() {
                super.process();
                System.out.println("mobile");
            }
        };
    }
    @Override
    void process() {
        super.process();
        System.out.println("mobile");
    }

}
