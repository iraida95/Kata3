package kata3;

import javax.swing.JPanel;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;



public class HistogramDisplay extends ApplicationFrame
{
    public HistogramDisplay(){
        super("HISTOGRAM");
        setContentPane(createPanel());
        pack();       
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel= new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        return chartPanel; 
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart =ChartFactory.createBarChart("","Dominios", "Numero de emails", dataset, PlotOrientation.VERTICAL, true, true, false);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataset= new DefaultCategoryDataset();
        dataset.addValue(17, "ENE", "gmail.com");
        dataset.addValue(20, "FEB", "hotmail.com");
        dataset.addValue(10, "ENE", "ulpgc.es");
        dataset.addValue(7, "FEB", "gmail.com");
        dataset.addValue(6, "ENE", "hotmail.com");
        dataset.addValue(4, "FEB", "ulpgc.es");
        return dataset;
    }
    
    public void execute(){
        setVisible(true);
    }
}
