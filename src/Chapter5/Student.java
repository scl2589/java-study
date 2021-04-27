package Chapter5;

public class Student {
    // 클래스에 선언된 변수는 멤버 변수이다.
    // 아래 public은 접근제어자라고 한다.
    public int studentID;
    public String studentName;
    public String address;

    // 생성자 직접 구현하기
    public Student(String name) {
        studentName = name;
    }

    // 생성자 오버로딩
    public Student(int id, String name) {
        studentID = id;
        studentName = name;
        address = "주소 없음";
    }

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }
    
//    public static void main(String[] args) {
//        Student studentPark = new Student();
//        studentPark.studentName = "박은종";
//        studentPark.showStudentInfo();
//    }
}
