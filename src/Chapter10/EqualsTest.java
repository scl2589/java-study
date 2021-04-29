package Chapter10;

class Student{
    int studentNum;
    String studentName;

    public Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    @Override
    public boolean equals (Object obj) {
        if ( obj instanceof Student) {
            // downcasting 진행
            Student std = (Student) obj;
//            return (this.studentNum == std.studentNum);
            if (this.studentNum == std.studentNum) return true;
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Student Lee = new Student(100, "이순신");
        Student Lee2 = Lee;
        Student Shin = new Student(100, "이순신");

        System.out.println(Lee == Lee2); //true
        System.out.println(Lee == Shin); //false
        System.out.println(Lee.equals(Shin)); //true -> 논리적으로 같다고 재정의해야 true가 된다.

        System.out.println(Lee.hashCode()); //100
        System.out.println(Shin.hashCode()); //100

        Integer i1 = 100;
        Integer i2 = 100;

        System.out.println(i1.equals(i2)); //true

        Integer i3 = new Integer(100);
        Integer i4 = new Integer(100);

        System.out.println(i1.equals(i2)); //true
        System.out.println(i1.hashCode()); //100
        System.out.println(i2.hashCode()); //100

        // 메모리 주소 찾기
        System.out.println(System.identityHashCode(i3)); //189568618
        System.out.println(System.identityHashCode(i4)); //793589513

    }
}
