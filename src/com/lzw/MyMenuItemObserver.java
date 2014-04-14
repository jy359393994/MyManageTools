package com.lzw;

import javax.swing.JInternalFrame;

import com.lzw.iframe.Jinhuodanframe;
import com.lzw.menu.MyJMenuItem.MenuItemObserver;

public class MyMenuItemObserver implements MenuItemObserver{

	private JInternalFrame miframe;
	private MyDesktopPane mDesktopPane;
	
	public MyMenuItemObserver(MyDesktopPane deskTopPane)
	{
		mDesktopPane = deskTopPane;
	}
	
	@Override
	public void onClick(String title) {
		// TODO Auto-generated method stub
		System.out.println("in the actionPerformed method of ItemActionListener");
		System.out.println("the miframe is null or closed");
		JInternalFrame[] allFrames = mDesktopPane.getAllFrames();
		int titleBarHight = 20*allFrames.length;
		int x = 20 + titleBarHight;
		int y = x;
		int width = 300;
		int height = 200;
		if(miframe == null || miframe.isClosed()){
			if("进货单".equals(title)){
				miframe = new Jinhuodanframe(title);	
				System.out.println("创建进货单窗体");
			}
			miframe.setBounds(x, y, width, height);
			miframe.setVisible(true);
			mDesktopPane.add(miframe);
		}
		System.out.println("title is not 进货单");
		if(miframe !=null){

		}
		
	System.out.println("title is not null or is not closed");
	}

}
