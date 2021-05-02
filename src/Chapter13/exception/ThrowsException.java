package Chatper13.exception;

import java.io.FileInputStream;
import java.io.FIleNotFoundException;

public class ThrowsException {

    public Class loadClass(String fileName, String className) throws FIleNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args ) {
        THrowsException test = new ThrowsException(); 

        try {
            test.loadClass("a.txt", "java.lang.String");
        } catch (FIleNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch {
            System.out.println(e);
        } 
        System.out.println("end"); 
    }
}