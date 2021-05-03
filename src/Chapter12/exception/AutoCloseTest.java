package Chapter12.exception;

public class AutoCloseTest {
    public static void main(String[] args) {
        try (AutoCloseObj obj = new AutoCloseObj()) {
            // exception 강제로 발생시키기
            throw new Exception();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
