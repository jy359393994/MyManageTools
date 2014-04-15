package com.lzw.menu;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.lzw.MyDesktopPane;
import com.lzw.MyMenuItemObserver;

public class BzMenu extends JMenu{
	private MyMenuItemObserver mMebuItemObserver;
	private JLabel mJLabel;
	private JMenuItem mGyItem;
	private JMenuItem mLxjszcItem;
	private JMenuItem mFwjswzItem;
	public BzMenu(MyMenuItemObserver itemobserver,JLabel label){
		super("帮助(H)");
		mMebuItemObserver = itemobserver;
		mJLabel = label;
		init();
	}
	
	private void init(){
		
		setMnemonic(KeyEvent.VK_H);	
		mGyItem = new MyJMenuItem("关于", "images/guanyu.png", mMebuItemObserver);
		mLxjszcItem = new MyJMenuItem("联系技术支持", "images/jishu_zhichi.png", mMebuItemObserver);
		mFwjswzItem = new MyJMenuItem("访问技术网站", "images/jishu_wangzhan.png", mMebuItemObserver);
/*		mGyItem = new JMenuItem("关于");
		ImageIcon gyicon = new ImageIcon("images/guanyu.png");
		mGyItem.setIcon(gyicon);*/
/*		mLxjszcItem = new JMenuItem("联系技术支持");
		ImageIcon lxjszcicon = new ImageIcon("images/jishu_zhichi.png");
		mLxjszcItem.setIcon(lxjszcicon);		
		mFwjswzItem = new JMenuItem("访问技术网站");
		ImageIcon jswzicon = new ImageIcon("images/jishu_wangzhan.png");
		mFwjswzItem.setIcon(jswzicon);*/
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
