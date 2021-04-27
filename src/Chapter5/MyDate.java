package Chapter5;

public class MyDate {
    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        if ( month < 1 || month > 12) {
            isValid = false;
        }
        else {
            this.month = month;
        }

    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year =year;
    }

    public int getYear() {
        return year;
    }

    public void showDate() {
        if (isValid){
            System.out.println( year + "년 " + month + "월 " + day + "일 입니다.");
        }
        else {
            System.out.println("");
        }
    }

}
