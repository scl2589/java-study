package Chapter14.stream.outputstream;

import java.io.FileOutputStream; 

public class FileOutPutTest2 {
    public static void main(String[] args) {
        byte[] bs = new byte[26]; 
        byte data = 65;
        for (int i = 0; i < bs.length; i++) {
            bs[i] = data; 
            data++; 
        }
        try(FileOutputStream fos = new FileOutputStream("output.txt", true)) {
            FileInputStream fis = new FileInputStream("alpha.txt")) {
                fos.write(bs); 
                int ch; 
                while (( ch = fis.read()) != -1) {
                    System.out.print((char) ch); 
                }
            }
        } catch(IOException e) {
            System.out.println(e); 
        }
    }
}