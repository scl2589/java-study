package Chapter14.stream.outputstream;

import java.io.FileOutputStream; 

public class FileOutputTest1 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("output.txt")) {
            fos.write(65); 
            fos.write(66); 
            fos.write(67); 
        } catch( IOException e) {
            System.out.println(e)
        }
    }
    
}