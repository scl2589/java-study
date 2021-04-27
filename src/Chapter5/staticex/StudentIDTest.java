package Chapter5.staticex;

public class StudentIDTest {
    public static void main(String[] args) {
        Student studentLee = new Student("Lee");
        System.out.println(studentLee.serialNum); //1001

        Student studentKim = new Student("Kim");

        System.out.println(studentKim.serialNum); //1002
        System.out.println(studentLee.serialNum); //1002

    }
}
