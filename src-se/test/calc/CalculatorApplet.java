/*
 * Copyright (C) 2006 Luca Veltri - University of Parma - Italy
 * 
 * This source code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This source code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this source code; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 * 
 * Author(s):
 * Luca Veltri (luca.veltri@unipr.it)
 */

package test.calc;


import java.applet.Applet;
import javax.swing.JFrame;

import it.unipr.netsec.zwt.ZwtView;
import it.unipr.netsec.zwt.frame.AppletFrame;
import test.calc.RPNCalculator;


/** Simple Applet-based calculator.
  */
public class CalculatorApplet extends Applet {
	
	/** Width */
	static final int WIDTH=300;

	/** Height */
	static final int HEIGHT=200;

	
	/** Applet Initialization. */
	public void init() {
		
		String param;

		int width=WIDTH;
		int height=HEIGHT;
		try  {
			if ((param=getParameter("width"))!=null) width=Integer.parseInt(param);
			if ((param=getParameter("height"))!=null) height=Integer.parseInt(param);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		AppletFrame zf=new AppletFrame(new ZwtView(new JFrame()),width,height);
		//zf.setSize(width,height);
		//zf.setDisplay(new JFrame());
		zf.displayAtCenter();
		
		RPNCalculator.RES_PATH=getCodeBase().toString();
		new RPNCalculator(zf,true);

	}

}
