package com.lzw;

import java.beans.PropertyVetoException;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class MyJInternalFrame extends JInternalFrame{

	public MyJInternalFrame(String title){
		super(title);
		setMaximizable(true);
		setResizable(true);
		setClosable(true);
		setIconifiable(true);
		try {
			setSelected(true);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
