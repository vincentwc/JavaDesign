package factory.SimpleFactory.four;

/**
 * 饼状图
 */
public class PieChart implements Chart {
    public PieChart() {
        System.out.println("创建饼状图");
    }

    @Override
    public void display() {
        System.out.println("展示饼状图");
    }
}
