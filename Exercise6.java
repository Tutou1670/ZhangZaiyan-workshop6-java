// 练习6：类变量(static) vs 实例变量 + 预测程序输出
public class Exercise6 {

    // 题目给的类：x 有 static，是类变量（全类共享一份）；y 没有 static，是实例变量（每个对象各一份）
    static class IdentifyMyParts {
        public static int x = 7;   // 类变量
        public int y = 3;          // 实例变量
    }

    public static void main(String[] args) {
        // ---- 第1问：类变量 ----
        System.out.println("Q1 Class variables: x");

        // ---- 第2问：实例变量 ----
        System.out.println("Q2 Instance variables: y");

        // ---- 第3问：运行题目代码，输出真实结果 ----
        System.out.println("Q3 Output of the code:");
        IdentifyMyParts a = new IdentifyMyParts();
        IdentifyMyParts b = new IdentifyMyParts();
        a.y = 5;
        b.y = 6;
        a.x = 1;   // x 是 static，a.x 和 b.x 指向同一份数据
        b.x = 2;   // 这里把共享的 x 改成了 2，所以 a.x 也是 2
        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);

        // 真实输出：a.y=5, b.y=6, a.x=2, b.x=2, IdentifyMyParts.x=2
        // 原因：y 是每个对象自己的；x 是全类共享的，最后一次赋值 b.x=2 覆盖了 a.x=1
    }
}
