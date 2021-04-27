package variable;

public class ExplicitConversion {
    public static void main(String[] args) {
        int i = 1000;
        // type casting을 통해 explicit conversion 진행
        // 그러나 데이터 유실 가능성 존재
        byte bNum = (byte)i;

        System.out.println(bNum); //-24

        double dNum1 = 1.2;
        float fNum = 0.9F;

        int iNum1 = (int)dNum1 + (int)fNum;
        int iNum2 = (int)(dNum1 + fNum);

        System.out.println(iNum1); // 1
        System.out.println(iNum2); // 2
    }
}
