package Chapter12.lambda;

//람다식을 위한 인터페이스라고 표기
@FunctionalInterface
public interface MyMaxNumber {
    int getMaxNumber(int x, int y);
//    void add(int x, int y);
}
