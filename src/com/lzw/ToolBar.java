package com.lzw;

import javax.swing.JLabel;
import javax.swing.JToolBar;

public class ToolBar extends JToolBar{
	private DesktopPane mDesktopPane;
	private JLabel mJLabel;
	public ToolBar(DesktopPane desktoppane,JLabel label){
		mDesktopPane = desktoppane;
		mJLabel = label;
		init();
	}
	 private void init(){
		 
	 }
}
