package newSt;

public class Threads {
    public static void main(String[] args) {
        Thread t1, t2;
        t1 = new Thread(() -> System.out.println("Thread 1"));
        t2 = new Thread(() -> System.out.println("Thread 2"));
        t1.start();
        t2.start();

    }

    //Thread States
    //New
    //Runnable
    //Running
    //Blocked
    //dead


}
