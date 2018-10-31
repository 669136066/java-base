package rt;

/**
 * 类实现描述：
 *
 * @author 谢岳金 2018年10月11日 下午4:50
 */
public class Demo {

    public static void main(String[] args) {
        // Thread t = Thread.currentThread();
        // System.out.println(t);
        // Context context = new Context();
        // context.setTrack("a");
        // System.out.println(context.getTrack());
        String key = "a";
        int h = key.hashCode();
        int hash = h ^ (h >>> 16);
        System.out.println(hash);
        System.out.println((16 - 1) & hash);

        System.out.println(key.hashCode() % 16);
        // HashMap<String, Object> objectObjectHashMap = new HashMap<String, Object>(3);
        // objectObjectHashMap.put("a", 1);
    }

    static class Context {

        private final ThreadLocal<String> myThreadLocal = new ThreadLocal<>();

        private String getTrack() {
            return myThreadLocal.get();
        }

        private void setTrack(String id) {
            myThreadLocal.set(id);
        }
    }
}
