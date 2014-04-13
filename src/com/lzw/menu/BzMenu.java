package com.lzw.menu;

import java.awt.event.KeyEvent;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.lzw.DesktopPane;

public class BzMenu extends JMenu{
	private DesktopPane mDesktopPane;
	private JLabel mJLabel;
	private JMenuItem mGyItem;
	private JMenuItem mLxjszcItem;
	private JMenuItem mFwjswzItem;
	public BzMenu(DesktopPane desktoppane,JLabel label){
		super("帮助(H)");
		mDesktopPane = desktoppane;
		mJLabel = label;
		init();
	}
	
	private void init(){
		
		setMnemonic(KeyEvent.VK_H);	
		add(getgyItem());
		add(getlxjszcItem());
		add(getfwjswzItem());
	}
	
	private JMenuItem getgyItem(){
		
		if(mGyItem == null){
			mGyItem = new JMenuItem("关于");
		}
		return mGyItem;
	}
	private JMenuItem getlxjszcItem(){
		
		if(mLxjszcItem == null){
			mLxjszcItem = new JMenuItem("联系技术支持");
		}
		return mLxjszcItem;
	}
	
	private JMenuItem getfwjswzItem(){
		
		if(mFwjswzItem == null){
			mFwjswzItem = new JMenuItem("访问技术网站");
		}
		return mFwjswzItem;
	}
	
}
