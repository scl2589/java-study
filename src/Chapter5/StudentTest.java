package Chapter5;

public class StudentTest {
    public static void main(String[] args) {
        // new는 생성자 - 메모리에 생성이 됨!
        Student studentLee = new Student("이순신");
//        studentLee.studentName = "이순신";
        studentLee.address = "서울";

        studentLee.showStudentInfo();

        //studentKim은 지역변수이다.
        Student studentKim = new Student(100, "김유신");
//        studentKim.studentName = "김유신";
//        studentKim.address = "경주";

        studentKim.showStudentInfo();
        // 앞은 package 이름.class 이름@16진수로 참조 변수가 가리키는 메모리 참조값
//        System.out.println(studentLee); //Chapter5.Student@3d494fbf
//        System.out.println(studentKim); //Chapter5.Student@1ddc4ec2
    }
}
