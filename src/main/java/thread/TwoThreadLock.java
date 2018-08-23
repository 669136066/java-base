package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author 谢岳金 2018年08月21日 下午11:11
 */
public class TwoThreadLock {

    /**
     * 重入锁
     */
    private final static Lock lock  = new ReentrantLock();
    private int               start = 1;
    private boolean           flag  = false;

    public static void main(String[] args) {
        TwoThreadLock twoThreadLock = new TwoThreadLock();
        Thread thread = new Thread(new OuNumimplements(twoThreadLock));
        thread.setName("偶数线程");
        Thread thread1 = new Thread(new JiNumimplements(twoThreadLock));
        thread1.setName("奇数线程");
        thread.start();
        thread1.start();
    }

    public static class OuNumimplements implements Runnable {

        TwoThreadLock number;

        public OuNumimplements(TwoThreadLock number) {
            this.number = number;
        }

        @Override
        public void run() {
            while (number.start <= 100) {
                if (number.flag) {
                    try {
                        lock.lock();
                        System.out.println(Thread.currentThread().getName() + ":" + number.start);
                        number.start++;
                        number.flag = false;
                    } catch (Exception e) {
                        lock.unlock();
                    }
                }
            }

        }
    }

    public static class JiNumimplements implements Runnable {

        TwoThreadLock number;

        public JiNumimplements(TwoThreadLock number) {
            this.number = number;
        }

        @Override
        public void run() {
            while (number.start <= 100) {
                if (!number.flag) {
                    try {
                        lock.lock();
                        System.out.println(Thread.currentThread().getName() + ":" + number.start);
                        number.start++;
                        number.flag = false;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }

        }
    }
}
