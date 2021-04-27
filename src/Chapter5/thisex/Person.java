package Chapter5.thisex;

public class Person {
    String name;
    int age;

    public Person() {
        this("이름 없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println(name + ", "+ age);
    }

    // 반환 타입은 클래스 자신이면ㄷ ㅚㄴ다.
    public Person getSelf() {
        return this;
    }
}
