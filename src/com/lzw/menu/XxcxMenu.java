package com.lzw.menu;

import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.lzw.DesktopPane;

public class XxcxMenu extends JMenu{
	private DesktopPane mDesktopPane;
	private JLabel mJLabel;
	private JMenuItem mXscxItem;
	private JMenuItem mSpcxItem;
	private JMenuItem mXsphItem;
	
	public XxcxMenu(DesktopPane desktoppane,JLabel label){
		super("信息查询(C)");
		mDesktopPane = desktoppane;
		mJLabel = label;
		init();
	}
	
	private void init(){
		
		setMnemonic(KeyEvent.VK_C);	
		add(getxscxItem());
		add(getspcxItem());
		add(getxsphItem());
	}
	
	private JMenuItem getxscxItem(){
		
		if(mXscxItem == null){
			mXscxItem = new JMenuItem("销售查询");
		}
		return mXscxItem;
	}

	public JMenuItem getspcxItem(){
		
		if(mSpcxItem == null){
			mSpcxItem = new JMenuItem("商品查询");
		}
		return mSpcxItem;
	}
	
	public JMenuItem getxsphItem(){
		
		if(mXsphItem == null){
			mXsphItem = new JMenuItem("销售排行");
		}
		return mXsphItem;
	}
}
