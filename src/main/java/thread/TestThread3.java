package thread;

public class TestThread3 {
    public static void delay(long ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception e) {

        }
    }

    // TestThread3
    public synchronized static void foo1() {
        delay(3000);
        System.out.println("End of foo1");
    }

    public static void foo2() {
        synchronized (TestThread3.class) { // monitor
            delay(2000);
            System.out.println("End of foo2");
        }
    }

    public void foo3() {
        // do some stuff for which you do not require synchronizatio
        synchronized (this) { // monitor
            delay(2000);
            System.out.println("End of foo3");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                TestThread3.foo1(); // foo1();
            }

        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                TestThread3 t = new TestThread3();
                t.foo3();
            }

        });
        t1.start();
        t2.start();
        // t3.start();
    }
}


