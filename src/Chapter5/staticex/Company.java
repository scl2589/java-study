package Chapter5.staticex;

public class Company {
    private static Company instance = new Company();

    // 내부에서 사용할 수 있는 생성자
    private Company() {}

    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
