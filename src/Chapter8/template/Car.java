package Chapter8.template;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {};

    // template method
    // 아래 있는 메서드들은 하위 클래스에서 재정의 되면 안되므로 final 키워드 추가
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
