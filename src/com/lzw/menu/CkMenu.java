package com.lzw.menu;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.lzw.MyDesktopPane;
import com.lzw.MyMenuItemObserver;

public class CkMenu extends JMenu{

	private MyMenuItemObserver mMebuItemObserver;
	private JLabel mJLabel;
	private JMenuItem mCkcdItem;
	private JMenuItem mQbgbItem;
	private JMenuItem mQbzxhItem;
	private JMenuItem mQbhyItem;
	public CkMenu(MyMenuItemObserver itemobserver,JLabel label){
		super("窗口(W)");
		mMebuItemObserver = itemobserver;
		mJLabel = label;
		init();
	}
	
	private void init(){
		
		setMnemonic(KeyEvent.VK_W);	
		mCkcdItem = new MyJMenuItem("窗口层叠", "images/chuangkou_pingpu.png", mMebuItemObserver);
		mQbgbItem = new MyJMenuItem("全部关闭", "images/quanbu_guanbi.png", mMebuItemObserver);
		mQbzxhItem = new MyJMenuItem("全部最小化", "images/quanbu_zuixiaohua.png", mMebuItemObserver);
		mQbhyItem = new MyJMenuItem("全部还原", "images/quanbu_huanyuan.png", mMebuItemObserver);
/*		mCkcdItem = new JMenuItem("窗口层叠");
		ImageIcon ckcdicon = new ImageIcon("images/chuangkou_pingpu.png");
		mCkcdItem.setIcon(ckcdicon);
		mQbgbItem = new JMenuItem("全部关闭");
		ImageIcon qbgbicon = new ImageIcon("images/quanbu_guanbi.png");
		mQbgbItem.setIcon(qbgbicon);
		mQbzxhItem = new JMenuItem("全部最小化");
		ImageIcon qbzxhicon = new ImageIcon("images/quanbu_zuixiaohua.png");
		mQbzxhItem.setIcon(qbzxhicon);
		mQbhyItem = new JMenuItem("全部还原");
		ImageIcon qbhyicon = new ImageIcon("images/quanbu_huanyuan.png");
		mQbhyItem.setIcon(qbhyicon);*/
		add(getckcdItem());
		add(getqbgbItem());
		add(getqbzxhItem());
		add(getqbhyItem());
	}
	
	private JMenuItem getckcdItem(){
		return mCkcdItem;
	}
	
	private JMenuItem getqbgbItem(){
		return mQbgbItem;
	}
	
	private JMenuItem getqbzxhItem(){
		return mQbzxhItem;
	}	
	private JMenuItem getqbhyItem(){
		return mQbhyItem;
	}	
	
}
