import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.util.Map;

public class Plot {
    public static void showPlot( Map<String, Double> map) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (var data: map.entrySet()) {
            dataset.addValue(data.getValue(), data.getKey(), "Платформа");
        }

        JFreeChart chart = ChartFactory.createBarChart(
                "Средние показатели глобальных продаж по платформам",
                "Платформа",
                "Показатели продаж",
                dataset);

        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        JFrame frame = new JFrame("First Task");
        frame.getContentPane().add(new ChartPanel(chart));
        frame.setSize(800, 500);
        frame.setVisible(true);
    }
}
