package Chapter5;

public class BirthdayTest {
    public static void main(String[] args) {
        Birthday date = new Birthday();
        date.setYear(2019);
        date.setMonth(13);
        date.setDay(30);

        date.showDate();
    }
}
