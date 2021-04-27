package variable;

public class ImplicitConversion {
    public static void main(String[] args){
        byte bNum = 10;
        int iNum = bNum;

        System.out.println(bNum); //10
        System.out.println(iNum); //10

        int iNum2 = 20;
        float fNum = iNum2;

        System.out.println(fNum); //20.0

        double dNum;
        dNum = fNum + iNum; // 정수가 먼저 float로 바뀌고, float가 더해져서 double로 바뀐다.
        System.out.println(dNum); //30.0
    }
}
