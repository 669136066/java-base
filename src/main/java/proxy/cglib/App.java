package proxy.cglib;

/**
 * 类实现描述：
 *
 * @author 谢岳金 2018年09月22日 下午10:07
 */
public class App {

    public static void main(String[] args) {
        Target target = new Target();
        Target proxyInstance = (Target) new ProxyFactory(target).getProxyInstance();
        proxyInstance.save();
    }
}
