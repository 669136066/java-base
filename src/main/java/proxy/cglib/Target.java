package proxy.cglib;

import proxy.invoke.Man;

/**
 * 类实现描述：
 *
 * @author 谢岳金 2018年09月22日 下午9:47
 */
public class Target implements Man {

    @Override
    public void findObject() {
            System.out.println("hi cglib , i will find you ");
        }
    }
}
