package package1;

import package2.ExamplePackage2;
import package2.Parent;

public class Main extends Parent{

    public static void main(String[] args) {
        ExamplePackage1 examplePackage1 = new ExamplePackage1();
     //   System.out.println(examplePackage1.name1);
        System.out.println(examplePackage1.name2);
        System.out.println(examplePackage1.name3);
        System.out.println(examplePackage1.name4);

        ExamplePackage2 examplePackage2 = new ExamplePackage2();
     //   System.out.println(examplePackage2.name1);
     //   System.out.println(examplePackage2.name2);
     //   System.out.println(examplePackage2.name3);
        System.out.println(examplePackage2.name4);

        Main parent = new Main();
    //    System.out.println(parent.name1);
    //    System.out.println(parent.name2);
        System.out.println(parent.name3);
        System.out.println(parent.name4);
    }

}
