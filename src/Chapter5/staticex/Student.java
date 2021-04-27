package Chapter5.staticex;

public class Student {
    private int studentID;
    public String studentName;
    public String address;
    public static int serialNum = 1000;


    public Student(String name) {
        studentName = name;
        serialNum++;
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