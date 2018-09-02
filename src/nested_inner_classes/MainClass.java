package nested_inner_classes;

public class MainClass{
    public static void main(String[] args) {
        MyClass.Inner instance = new MyClass().new Inner();
        instance.method();


        MyNweClass.Nested.staticMethodFromNested();

    }
}
