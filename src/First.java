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
	double values1[][] = new double[2][100];
	double values2[][] = new double[2][100];
	DefaultXYDataset data=new DefaultXYDataset();

	Double x = -5.0;
	for( int i = 0 ; i < 100; i++,x+=0.1)
	{
		if(i < 50)
		{
			values1[0][i] = x;
			values1[1][i] = Math.exp(-Math.pow(x, 2));
		}
		else
		{
			values1[0][i] = x;
			values1[1][i] = Math.cos(x);
		}
	}
	data.addSeries(c1, values1);
	//data.addSeries(c2, values2);
 
    //create a chart...
	JFreeChart chart=ChartFactory.createXYLineChart("XYLineChart", "x", "y", data, PlotOrientation.VERTICAL, true, false, false);
   
    //create and display a frame...
    ChartFrame frame=new ChartFrame("First",chart);
    frame.pack();
    frame.setVisible(true);
  }
 
}