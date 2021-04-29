package Chapter11.collection;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<String>();

        myList.add("A");
        myList.add("B");
        myList.add("C");

        System.out.println(myList); // [A, B, C]

        myList.add(1, "D");
        System.out.println(myList); // [A, D, B, C]
        myList.removeLast() ;
        System.out.println(myList); //[A, D, B]

        for (int i=0; i< myList.size(); i++) {
            String s = myList.get(i);
            System.out.println(s);
        }


    }
}
