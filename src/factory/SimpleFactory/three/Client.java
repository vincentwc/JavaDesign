package factory.SimpleFactory.three;

public class Client {

    public static void main(String[] args) {
        Chart chart = ChartFactory.getChart("histogram");
        chart.display();
    }
}
