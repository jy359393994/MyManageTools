package com.lzw.menu;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.lzw.MyDesktopPane;
import com.lzw.MyMenuItemObserver;

public class XsglMenu extends JMenu {
	
	private MyMenuItemObserver mMebuItemObserver;
	private JLabel mJLabel;
	private JMenuItem mXsdItem;
	private JMenuItem mXsthItem;
	
	public XsglMenu(MyMenuItemObserver itemobserver,JLabel label){
		super("销售管理(X)");
		mMebuItemObserver = itemobserver;
		mJLabel = label;
		init();
	}
	
	private void init(){
		
		setMnemonic(KeyEvent.VK_X);	
		mXsdItem = new MyJMenuItem("销售单", "images/xiaoshoudan.png", mMebuItemObserver);
		mXsthItem = new MyJMenuItem("销售退货", "images/xiaoshou_tuihuo.png", mMebuItemObserver);
/*		mXsdItem = new JMenuItem("销售单");
		ImageIcon xsdicon = new ImageIcon("images/xiaoshoudan.png");
		mXsdItem.setIcon(xsdicon);
		mXsthItem = new JMenuItem("销售退货");
		ImageIcon xsthicon = new ImageIcon("images/xiaoshou_tuihuo.png");
		mXsthItem.setIcon(xsthicon);*/
		add(getxsdItem());
		add(getxsthItem());
	}
	
	public JMenuItem getxsdItem(){
		return mXsdItem;
	}

	private JMenuItem getxsthItem(){
		return mXsthItem;
	}
}
