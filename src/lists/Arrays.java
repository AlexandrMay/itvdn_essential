package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arrays {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add("Student");
        arrayList.add("How are you?");

        System.out.println(arrayList);

        arrayList.add(0, "teacher");
        arrayList.remove(1);
        arrayList.remove("How are you?");

        System.out.println(arrayList);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(7);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            Integer integer = iterator.next();
            System.out.println(integer);
        }
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()){
            Integer integer = listIterator.next();
            System.out.println(integer);
        }



    }
}
