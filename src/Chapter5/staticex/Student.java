package Chapter5.staticex;

public class Student {
    private int studentID;
    public String studentName;
    public String address;
    public static int serialNum = 1000;


    public Student(String name) {
        studentName = name;
        serialNum++;
        // 매번 증가되는 serialNum이 각 인스턴스의 학번이 된다.
        studentID = serialNum;

    }

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
        address = "주소 없음";
    }

    public void showStudentInfo() {
        System.out.println(studentName + "," + address );
    }

    public String getStudentName() {
        return studentName;
    }
}