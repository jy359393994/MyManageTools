package com.lzw;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Tools {
	public static int getWidth(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screen = kit.getScreenSize();
		return screen.width;
	}
	
	public static int getHeight(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screen = kit.getScreenSize();
		return screen.height;
	}	

}
