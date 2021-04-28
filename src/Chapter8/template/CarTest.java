package Chapter8.template;

public class CarTest {
    public static void main(String[] args) {
        Car aiCar = new AICar();
        aiCar.run();
        System.out.println("______________");
        Car manualCar = new ManualCar();
        manualCar.run();
    }
}
