package jvm.reference;

/**
 * 类实现描述：值传递,对基本数据类型的数据进行操作，由于原始内容和副本都是存在实际值，并且是在不同的栈区，因此形参的操作，不影响原始内容
 *
 * @author 谢岳金 2018年10月30日 下午2:01
 */
public class ValueCross {

    public static void valueCrossTest(int age, float weight) {
        System.out.println("传入的age:" + age);
        System.out.println("传入的weight:" + weight);
        age = 33;
        weight = 99.5f;
        System.out.println("方法内重新赋值后的age:" + age);
        System.out.println("方法内重新赋值后的weight:" + weight);
    }

    public static void main(String[] args) {
        int a = 25;
        float weight = 77.3f;
        valueCrossTest(a, weight);
        System.out.println("方法执行后的age:" + a);
        System.out.println("方法执行后的weight:" + weight);
    }
}
