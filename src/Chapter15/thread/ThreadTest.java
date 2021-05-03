package Chapter15.thread;

class MyThread extends Thread{
    public void run() {
        int i;
        for (i = 0; i <= 200; i++) {
            System.out.print(i + "\t");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        // start와 end가 먼저 찍힌다.
        // 제일 먼저 종료되는 것은 main thread이다.
        System.out.println("start");
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();

        th1.start();
        th2.start();
        System.out.println("end");
    }

}
