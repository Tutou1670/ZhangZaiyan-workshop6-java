// 练习7 第1个类：Boxes——负责在控制台画出指定尺寸的方框
// 横边用 '-'，竖边用 '|'
public class Boxes {
    private int size; // 方框的尺寸（行数=列数=size，最大 10）

    // 构造器：创建时传入尺寸
    public Boxes(int size) {
        this.size = size;
    }

    // 设置尺寸的方法
    public void setSize(int size) {
        this.size = size;
    }

    // toString：把尺寸以 "宽 x 高" 的形式返回，例如 "10 x 10"
    @Override
    public String toString() {
        return size + " x " + size;
    }

    // 画框：第一行和最后一行是横线，中间行是 '|' + 中间横杠 + '|'
    public void draw() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row == 0 || row == size - 1) {
                    System.out.print("-"); // 上下横边
                } else if (col == 0 || col == size - 1) {
                    System.out.print("|"); // 左右竖边
                } else {
                    System.out.print(" "); // 内部留空
                }
            }
            System.out.println(); // 换行
        }
    }
}
