package designpatterns.lishi;

/**
 * 类实现描述：
 *
 * @author 谢岳金 2018年09月29日 下午5:20
 */
public class ShangDongChef extends Chef {

    @Override
    protected void cooking(String dishName) {
        switch (dishName) {
            case "大葱炒海参":
                cookingHs();
                break;
            default:
                throw new IllegalArgumentException("不会烧");
        }
    }

    private void cookingHs() {
        System.out.println("先炒海参");
        System.out.println("再炒大葱");
        System.out.println("。。。。。");

    }
}
