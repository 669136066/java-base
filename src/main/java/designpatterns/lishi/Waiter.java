package designpatterns.lishi;

/**
 * 类实现描述：
 *
 * @author 谢岳金 2018年10月08日 下午3:37
 */
public class Waiter {

    public void order(String dishName) {
        System.out.println("点餐：" + dishName);
        Chef chef = new SichuanChef();
        switch (dishName) {
            case "大葱炒海参":
                chef = new ShangDongChef();
                break;
            case "酸辣土豆丝":
                chef = new SichuanChef();
                break;

        }
        chef.cooking(dishName);
        System.out.println(dishName + "，您的菜品");
    }
}
