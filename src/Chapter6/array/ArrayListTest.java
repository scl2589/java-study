package Chapter6.array;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
//        ArrayList list = new ArrayList();
        ArrayList<String> list = new ArrayList<String>();

        list.add("AAA");
        list.add("BBB");
        list.add("CCC");

        // size를 통해 length를 구할 수 있음
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }

        for (String s: list) {
            System.out.println(s);
        }
    }
}