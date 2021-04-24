import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        test();

    }

    public static void test() {
        System.out.println(
                "Привет ...".equals(
                        StringUtils.abbreviate("Привет всем кто живет на луне!", 10)));
        System.out.println(
                "Привет всем кто ж...".equals(
                        StringUtils.abbreviate("Привет всем кто живет на луне!", 20)));

    }
}
