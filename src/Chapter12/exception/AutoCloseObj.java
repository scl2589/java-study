package Chapter12.exception;

public class AutoCloseObj implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("close()가 호출되었습니다.");
    }
}
