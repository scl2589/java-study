package Chapter5.cooperation;

public class Subway {
    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) { //승차
        this.money += money;
        passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println(lineNumber + "노선의 지하철 승객은 " + passengerCount + "명 이고,  수입은 "+ money + "입니다.");
    }
}
