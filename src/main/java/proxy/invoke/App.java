package proxy.invoke;

/**
 * 类实现描述：
 *
 * @author 谢岳金 2018年09月21日 下午10:40
 */
public class App {

    public static void main(String[] args) {
        Man man = new Target();
        ManHandler manHandler = new ManHandler(man);
        Man proxy = (Man) manHandler.getProxyInstance();
        System.out.println(proxy.getClass().getName());
        proxy.findObject();
    }
}
