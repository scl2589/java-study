package Chapter10.string;

public class StringBuilderTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        //java 스트링을 기반으로 stringbuilder 가 생성된다.
        StringBuilder buffer = new StringBuilder(java);
        System.out.println(System.identityHashCode(buffer));
        buffer.append("android");

        java = buffer.toString();
    }

}
