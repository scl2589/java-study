package Chapter5;

public class Birthday {
    // private 이기 때문에 외부에서 접근 불가
    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        if (month < 1 || month > 12) {
            isValid = false;
        } else {
            isValid = true;
        }
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate() {
        if (isValid) {
            System.out.println(year + "년" + month + "월 " + day + "일 입니다.");
        } else {
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }

    // 변경하진 못하고, 읽어갈 수 있도록 한다.
    public boolean getIsValid() {
        return isValid;
    }
}
