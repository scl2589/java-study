package Chapter6.array;

public class ArrayTest {

    public static void main(String[] args) {

        // 배열 초기화하기
        int[] arr = new int[10];
        //int[] arr = new int[] {1, 2, 3};

        // 배열 선언과 동시에 초기화하기
        int[] arr2 = {1, 2, 3};

        int total = 0;

        for (int i = 0, num=1; i < arr.length; i++, num++) {
            arr[i] = num;
            total += arr[i];
        }

        for (int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(total);

        double[] dArr = new double[5];
        int count = 0;

        dArr[0] = 1.1; count++;
        dArr[1] = 2.1; count++;
        dArr[2] = 3.1; count++;

        double mtotal = 1;
        for (int i = 0; i < count; i++) {
            mtotal *= dArr[i];
        }
        System.out.println(mtotal);
    }
}
