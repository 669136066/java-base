package proxy.invoke;

/**
 * 类实现描述：
 *
 * @author 谢岳金 2018年09月21日 下午10:35
 */
public class Target implements Man {

    @Override
    public void findObject() {
        System.out.println("hi , i will find you");
    }
}
