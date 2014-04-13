package com.lzw.menu;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
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
		mGyItem = new JMenuItem("关于");
		ImageIcon gyicon = new ImageIcon("images/guanyu.png");
		mGyItem.setIcon(gyicon);
		mLxjszcItem = new JMenuItem("联系技术支持");
		ImageIcon lxjszcicon = new ImageIcon("images/jishu_zhichi.png");
		mLxjszcItem.setIcon(lxjszcicon);		
		mFwjswzItem = new JMenuItem("访问技术网站");
		ImageIcon jswzicon = new ImageIcon("images/jishu_wangzhan.png");
		mFwjswzItem.setIcon(jswzicon);
		add(getgyItem());
		add(getlxjszcItem());
		add(getfwjswzItem());
	}
	
	private JMenuItem getgyItem(){
		return mGyItem;
	}
	private JMenuItem getlxjszcItem(){
		return mLxjszcItem;
	}
	
	private JMenuItem getfwjswzItem(){
		return mFwjswzItem;
	}
	
}
