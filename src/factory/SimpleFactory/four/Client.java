package factory.SimpleFactory.four;

import factory.SimpleFactory.four.Chart;

/**
 *
 */
public class Client {

    public static void main(String[] args) {
        Chart chart;
        //如果要改变图标，只用更改xml配置，无需修改任何代码，符合开闭原则
        String type = XMLUtil.getChartType();
        chart = ChartFactory.getChart(type);
        chart.display();
    }
}
