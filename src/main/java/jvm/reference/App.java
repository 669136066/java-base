package jvm.reference;

/**
 * <pre>
 * 这里分两种情况，一种是形参和实参保持指向同一个对象地址，则形参和操作会影响实参指向的对象内容，
 * 一种是形参被改动指向新的对象地址，则形参的操作不会影响实参指向的对象的内容
 * </pre>
 * 
 * @author 谢岳金 2018年10月30日 下午2:52
 */
public class App {

    public static void persionCross(Person person) {
        System.out.println("传入的person name :" + person.getName());
        // person = new Person();
        person.setName("张大胖");
        System.out.println("方法内重新赋值person name :" + person.getName());
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Bill");
        person.setAge(45);
        persionCross(person);
        System.out.println("方法执行后的name:" + person.getName());
    }

}
