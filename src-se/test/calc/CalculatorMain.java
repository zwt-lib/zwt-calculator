package test.calc;


import javax.swing.JFrame;

import it.unipr.netsec.zwt.ZwtFrame;
import it.unipr.netsec.zwt.ZwtView;
import test.calc.RPNCalculator;


/** RPN Calculator.
 */
public class CalculatorMain {
	
	public static void main(String[] args) {
		JFrame jframe=new JFrame();
		jframe.setTitle("RPN Calculator");
		jframe.setLocationByPlatform(true);
		
		//ZwtFrame frame=new ZwtFrame(new ZwtView(jframe),200,400);
		ZwtFrame frame=new ZwtFrame(new ZwtView(jframe),240,320); // Nokia size
		//ZwtFrame frame=new ZwtFrame(new ZwtView(jframe),300,200);
		new RPNCalculator(frame,true);
	}

}
