package com.lzw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JInternalFrame;

import com.lzw.iframe.Jinhuodanframe;

public class ItemActionListener implements ActionListener{
	JInternalFrame miframe;
	String mtitle;
	MyDesktopPane mDesktopPane;
	public ItemActionListener(String title,MyDesktopPane desktoppane){
		mtitle = title;
		mDesktopPane = desktoppane;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
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
				if(mtitle.equals("进货单")){
					miframe = new Jinhuodanframe(mtitle);	
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
