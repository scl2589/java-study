package Chapter9;

public interface Calc {
    // interface의 모든 변수는 상수이다.
    double PI = 3.14;
    int ERROR = -999999999;

    // interface 선언
    int add(int num1, int num2);
    int subtract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    default void description(){
        System.out.println("정수 계산기를 구현합니다.");
        myMethod();
    };

    static int total(int[] arr) {
        int total = 0;

        for (int i: arr) {
            total += i;
        }

        return total;
    }

    private void myMethod() {
        System.out.println("private method");
    }

    private static void mystaticMethod() {
        System.out.println("private static method");
    }

}
