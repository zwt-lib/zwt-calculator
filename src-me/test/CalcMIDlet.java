package test;


import it.unipr.netsec.zwt.ZwtView;
import it.unipr.netsec.zwt.frame.VirtualPointerFrame;
import test.calc.RPNCalculator;

import javax.microedition.midlet.MIDlet;


/** Simple calculator.
  */
public class CalcMIDlet extends MIDlet {
	

	/** Creates a new CalcMIDlet. */
	public CalcMIDlet() {
		VirtualPointerFrame zf=new VirtualPointerFrame(new ZwtView(this),-1,-1);
		new RPNCalculator(zf,true);
		
		// repaint the UI
		zf.repaintScreen();
		try {  Thread.sleep(50);  } catch (Exception e) {}
		zf.repaintScreen();
	}

	/** From MIDlet. Signals the MIDlet that it has entered the Active state. */
	public void startApp() {
		
	}  
	
	/** From MIDlet. Signals the MIDlet to enter the Paused state. */
	public void pauseApp() {
		
	}  
	
	/** From MIDlet. Signals the MIDlet to terminate and enter the Destroyed state. */
	public void destroyApp(boolean unconditional) {
		
	}

}
