import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.io.File;
import java.util.Calendar;

/**
 * Created by john_ on 2017-12-02.
 */

public class LineChart {
    public static void main( String[ ] args ) throws Exception {
        Calendar cal = Calendar.getInstance();
        System.out.println("The month is " + (cal.get(Calendar.MONTH) + 1));
        System.out.println("Today is " + cal.get(Calendar.DAY_OF_MONTH));
        for (int i = 0; i > -30; i--) {
            cal.add(Calendar.DATE, -1);
            System.out.println((cal.get(Calendar.MONTH) + 1)+ "/" + cal.get(Calendar.DAY_OF_MONTH));
        }
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        
        JFreeChart lineChartObject = ChartFactory.createLineChart(
                "Value Vs Days","Past 30 Days",
                "Stock Value",
                line_chart_dataset, PlotOrientation.VERTICAL,
                true,true,false);

        int width = 640;    /* Width of the image */
        int height = 480;   /* Height of the image */
        File lineChart = new File( "LineChart.jpeg" );
        ChartUtilities.saveChartAsJPEG(lineChart ,lineChartObject, width ,height);
    }
}
