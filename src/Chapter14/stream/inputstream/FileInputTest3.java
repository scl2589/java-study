package Chapter14.stream.inputstream;

import java.io.FileInputStream; 

public class FileInputTest3 {
    public static void main(string[] args) {
        try (FileInputStream fis = new FileInputStream("input2.txt")) {
            int i; 
            byte[] bs = new byte[10];
            while (( i = fis.read(bs)) != -1 ) {
                // for (byte b: bs) {
                //     System.out.print((char) b ); 
                // }
                // Garbage 출력을 막기 위함이다 
                for (int k = 0; k < i; k++0) {
                    System.out.print((char) bs[k]); 
                }
                System.out.println(); 
            }
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}