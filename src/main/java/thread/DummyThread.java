package thread;

public class DummyThread implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getName() + " is invoked!");
    }

}
