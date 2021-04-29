package Chapter10.string;

public class StringTest2 {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java)); //284720968

        java = java.concat(android);
        System.out.println(java); //javaandroid
        System.out.println(System.identityHashCode(java)); //189568618

    }
}
