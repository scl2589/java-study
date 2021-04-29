package Chapter10.classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = String.class;

        String str = new String();
        Class c2 = str.getClass();


        // 클래스의 정보를 알 수 있다.
        Class c3 = Class.forName("java.lang.String");
        Constructor[] cons = c3.getConstructors();
        for (Constructor con: cons) {
            System.out.println(con);
        }

        System.out.println();

        Method[] methods = c3.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
