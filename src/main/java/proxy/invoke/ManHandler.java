package proxy.invoke;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 类实现描述：
 *
 * @author 谢岳金 2018年09月21日 下午10:36
 */
public class ManHandler {

    private Man man;

    public ManHandler(Man man) {
        this.man = man;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(man.getClass().getClassLoader(), new Class[] { Man.class }, new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                before();
                Object invokeObj = method.invoke(man, null);
                after();
                return invokeObj;
            }
        });

    }

    public void before() {
        System.out.println("开始事务");
    }

    public void after() {
        System.out.println("提交事务");
    }
}
