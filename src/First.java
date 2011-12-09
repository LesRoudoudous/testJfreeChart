import  org.jfree.chart.ChartFactory;
import  org.jfree.chart.ChartFrame;
import  org.jfree.chart.JFreeChart;
import  org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.PlotOrientation;


public class First {
 
  public static void main(String[] args) {
    
  //create a dataset...
	  Double c = 1.0, c1 = 2.0, y = 0.0;
	DefaultCategoryDataset data=new DefaultCategoryDataset();

	for( Double x = 0.0; x < 5; x+=0.1)
	{
		y = Math.cos(x);
		data.addValue(y,c,x);
	}
    
	for( Double x = 0.0; x < 5; x+=0.1)
	{
		y = Math.sin(x);
		data.addValue(y,c1,x);
	}

 
    //create a chart...
    JFreeChart chart=ChartFactory.createLineChart("lineChart", "x", "y", data, PlotOrientation.VERTICAL, false, false, false);
   
    //create and display a frame...
    ChartFrame frame=new ChartFrame("First",chart);
    frame.pack();
    frame.setVisible(true);
  }
 
}