package thread;

/**
 * @author 谢岳金 2018年08月23日 下午10:13
 */
public class TwoThreadSynchronized {

    private int     start = 1;
    private boolean flag;

    public static void main(String[] args) {
        TwoThreadSynchronized twoThreadSynchronized = new TwoThreadSynchronized();
        Thread thread = new Thread(new OuNumimplements(twoThreadSynchronized));
        thread.setName("偶数线程");
        Thread thread1 = new Thread(new JiNumimplements(twoThreadSynchronized));
        thread1.setName("奇数线程");
        thread.start();
        thread1.start();
    }

    public static class OuNumimplements implements Runnable {

        TwoThreadSynchronized number;

        public OuNumimplements(TwoThreadSynchronized n1) {
            this.number = n1;
        }

        @Override
        public void run() {
            while (number.start <= 100) {
                synchronized (TwoThreadSynchronized.class) {
                    System.out.println("偶数锁");
                    if (number.flag) {
                        System.out.println(Thread.currentThread().getName() + ":" + number.start);
                        number.start++;
                        number.flag = false;
                        // 唤醒等待的线程
                        TwoThreadSynchronized.class.notify();
                    } else {
                        try {
                            TwoThreadSynchronized.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    public static class JiNumimplements implements Runnable {

        TwoThreadSynchronized number;

        public JiNumimplements(TwoThreadSynchronized number) {
            this.number = number;
        }

        @Override
        public void run() {
            while (number.start <= 100) {
                synchronized (TwoThreadSynchronized.class) {
                    System.out.println("奇数锁");
                    if (!number.flag) {
                        System.out.println(Thread.currentThread().getName() + ":" + number.start);
                        number.start++;
                        number.flag = true;
                        TwoThreadSynchronized.class.notify();
                    } else {
                        try {
                            TwoThreadSynchronized.class.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        }

    }
}
