package designpatterns.lishi;

/**
 * 类实现描述：
 *
 * @author 谢岳金 2018年09月29日 下午4:38
 */
public class App {

    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.order("大葱炒海参");
        System.out.println("---------");
        waiter.order("酸辣土豆丝");
    }
}
