package Chapter12.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
//            return;
        } finally {
            try {
                fis.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("end");

    }
}
