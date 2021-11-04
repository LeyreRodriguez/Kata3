package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.ui.ApplicationFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

//Otras cosas que requerian importaciones
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class HistogramDisplay extends ApplicationFrame {
    
    public HistogramDisplay(){
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    
    private JPanel createPanel(){
        ChartPanel  chartPanel;
        chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,400));
        
        return chartPanel;
        
    }    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart =  ChartFactory.createBarChart(
                "Histograma JFreeChart",
                "Dominios email",
                "Nº de emails",
                dataSet,
                PlotOrientation.VERTICAL,
                false,
                false,
                rootPaneCheckingEnabled);
        
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(4,"","ulpgc.es");
        dataSet.addValue(7,"","google.es");
        dataSet.addValue(2,"","canarias7.es");
        dataSet.addValue(5,"","marca.es");
        return dataSet;
    }
    
    
}