package Chapter14.stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException; 


public class FileInputTest1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("input.txt"); 
            int i;
            //FileInputStream - 파일의 끝에 도달하면 -1을 출력 
            while ((i = fis.read())  != -1){
                System.out.println((char)i);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close(); 
            } catch (Exception e) {
                e.printStackTrace(); 
            }
        }
        System.out.println("end");
    }
    
}