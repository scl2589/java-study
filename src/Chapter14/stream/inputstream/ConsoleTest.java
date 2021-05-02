package Chapter14.stream.inputstream;

public class ConsoleTest {
    public static void main(String[] args) {
        Console console = System.console(); 

        System.out.println("이름: ");
        String name = console.readLine(); 
        System.out.println("비밀번호: ");
        console.readPassword(); 
        char[] password = console.readPassword(); 

        System.out.rpintln(name); 
        SYstem.out.println(password); 
    }

}