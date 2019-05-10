package factory.SimpleFactory.three;

/**
 * 柱状图类
 */
public class HistogramChart implements Chart {
    public HistogramChart() {
        System.out.println("创建柱状图");
    }

    @Override
    public void display() {
        System.out.println("柱状图表展示");
    }
}
