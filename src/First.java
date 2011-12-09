import  org.jfree.chart.ChartFactory;
import  org.jfree.chart.ChartFrame;
import  org.jfree.chart.JFreeChart;
import  org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.chart.plot.PlotOrientation;


public class First {
 
	public static void main(String[] args) {
    
	//create a dataset...
	String c1 = "courbe 1", c2 = "courbe 2";
	double values1[][] = new double[2][50];
	double values2[][] = new double[2][50];
	DefaultXYDataset data=new DefaultXYDataset();

	Double x = 0.0;
	for( int i = 0 ; i < 50; i++,x+=0.1)
	{
		values1[0][i] = x;
		values1[1][i] = Math.cos(x);
			
		values2[0][i] = x;
		values2[1][i] = Math.sin(x);
	}
	data.addSeries(c1, values1);
	data.addSeries(c2, values2);
 
    //create a chart...
	JFreeChart chart=ChartFactory.createXYLineChart("XYLineChart", "x", "y", data, PlotOrientation.VERTICAL, true, false, false);
   
    //create and display a frame...
    ChartFrame frame=new ChartFrame("First",chart);
    frame.pack();
    frame.setVisible(true);
  }
 
}