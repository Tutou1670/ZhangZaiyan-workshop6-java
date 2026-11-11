// 练习7 第2个类：驱动类——用 main() 方法测试 Boxes 类
public class BoxDriver {
    public static void main(String[] args) {
        // 测试第 1 个尺寸：5
        Boxes box1 = new Boxes(5);
        System.out.println("Box " + box1.toString() + ":");
        box1.draw();
        System.out.println();

        // 测试第 2 个尺寸：8（用 setSize 改尺寸）
        Boxes box2 = new Boxes(3);
        box2.setSize(8);
        System.out.println("Box " + box2.toString() + ":");
        box2.draw();
    }
}
