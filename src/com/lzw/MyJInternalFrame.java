package com.lzw;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class MyJInternalFrame extends JInternalFrame{

	public MyJInternalFrame(String title){
		super(title);
		setMaximizable(true);
		setResizable(true);
		setClosable(true);
		setIconifiable(true);
		
	}
}
