package designpatterns.lishi;

/**
 * 类实现描述：
 *
 * @author 谢岳金 2018年09月29日 下午5:18
 */
public abstract class Chef {

    public void cook(String dishName) {
        System.out.println("开始烹饪：" + dishName);
        cooking(dishName);
        System.out.println(dishName + "出锅");
    }

    protected abstract void cooking(String dishName);
}
