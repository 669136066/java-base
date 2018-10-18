package designpatterns.lishi;

/**
 * 类实现描述：
 *
 * @author 谢岳金 2018年10月08日 下午3:35
 */
public class SichuanChef extends Chef {

    @Override
    protected void cooking(String dishName) {
        switch (dishName) {
            case "酸辣土豆丝":
                cookingPotato();
                break;
            default:
                throw new IllegalArgumentException("不会");
        }
    }

    private void cookingPotato() {
        System.out.println("先放葱姜蒜");
        System.out.println("再放土豆丝");
        System.out.println("。。。");
    }
}
