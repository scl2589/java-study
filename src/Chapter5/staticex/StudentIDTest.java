package Chapter5.staticex;

public class StudentIDTest {
    public static void main(String[] args) {
        Student studentLee = new Student("Lee");
        System.out.println(studentLee.serialNum); //1001

        Student studentKim = new Student("Kim");

        // 같은 메모리를 바라보고 있다는 것을 알 수 있따.
        System.out.println(studentKim.serialNum); //1002
        System.out.println(studentLee.serialNum); //1002

    }
}
