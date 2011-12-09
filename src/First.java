import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

import  org.jfree.chart.ChartFactory;
import  org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import  org.jfree.chart.JFreeChart;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.chart.plot.PlotOrientation;

public class First {
 
	public static void main(String[] args) {
    
	//create a dataset...
	String c1 = "courbe 1", c2 = "courbe 2";
	double values1[][] = new double[2][101];
	double values2[][] = new double[2][101];
	DefaultXYDataset data=new DefaultXYDataset();

	Double x = -5.0;
	for( int i = 0 ; x <= 5.0; i++,x+=0.1)
	{
		if(x < 0.0)
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
	//(JFreeChart chart, int width, int height, int minimumDrawWidth, int minimumDrawHeight, int maximumDrawWidth, int maximumDrawHeight, boolean useBuffer, boolean properties, boolean save, boolean print, boolean zoom, boolean tooltips)
	ChartPanel chartP = new ChartPanel(chart);//,600,400,100,100,600,400,false,false,false,false,false,false);
	chartP.setSize(600, 400);
    //create and display a frame...
    /*ChartFrame frame = new ChartFrame("First",chart);
    frame.pack();
    frame.setVisible(true);*/
	
	
	
	
	JFrame frame = new JFrame();
	frame.setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	//c.fill = GridBagConstraints.BOTH;
	c.ipady = 400; 
	c.ipadx = 600;
	c.gridx = 0;
	c.gridy = 0;
	//c.weightx = 0.0;
	c.gridwidth = 2;
	frame.add(chartP,c);

	JCheckBox chk = new JCheckBox("5 points");
	c.gridwidth = 1;
	c.ipady = 0;
	c.gridx = 0;
	c.gridy = 1;
	frame.add(chk, c);
	
	chk = new JCheckBox("11 points");
	c.gridx = 0;
	c.gridy = 2;
	frame.add(chk, c);
	
	chk = new JCheckBox("21 pints");
	c.gridx = 0;
	c.gridy = 3;
	frame.add(chk, c);
	

	chk = new JCheckBox("Newton");
	c.gridx = 1;
	c.gridy = 1;
	frame.add(chk, c);
	
	chk = new JCheckBox("Tchébytchev");
	c.gridx = 1;
	c.gridy = 2;
	frame.add(chk, c);
	
	chk = new JCheckBox("Splin");
	c.gridx = 1;
	c.gridy = 3;
	frame.add(chk, c);
	
    frame.setVisible(true);
    frame.setSize(600, 515);
  }
 
}