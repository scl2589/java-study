package Chapter8.abstractex;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Desktop();
        computer.display();
        computer.turnOff();
    }
}
