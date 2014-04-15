package com.lzw.menu;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import com.lzw.MyDesktopPane;
import com.lzw.MyMenuItemObserver;

public class XxcxMenu extends JMenu{
	private MyMenuItemObserver mMebuItemObserver;
	private JLabel mJLabel;
	private JMenuItem mXscxItem;
	private JMenuItem mSpcxItem;
	private JMenuItem mXsphItem;
	
	public XxcxMenu(MyMenuItemObserver itemobserver,JLabel label){
		super("信息查询(C)");
		mMebuItemObserver = itemobserver;
		mJLabel = label;
		init();
	}
	
	private void init(){
		
		setMnemonic(KeyEvent.VK_C);	
		mXscxItem = new MyJMenuItem("销售查询", "images/xiaoshou_chaxun.png", mMebuItemObserver);
		mSpcxItem = new MyJMenuItem("商品查询", "images/shangpin_chaxun.png", mMebuItemObserver);
		mXsphItem = new MyJMenuItem("销售排行", "images/xiaoshou_paihang.png", mMebuItemObserver);
/*		mXscxItem = new JMenuItem("销售查询");
		ImageIcon xscxicon = new ImageIcon("images/xiaoshou_chaxun.png");
		mXscxItem.setIcon(xscxicon);
		mSpcxItem = new JMenuItem("商品查询");
		ImageIcon spcxicon = new ImageIcon("images/shangpin_chaxun.png");
		mSpcxItem.setIcon(spcxicon);
		mXsphItem = new JMenuItem("销售排行");
		ImageIcon xsphicon = new ImageIcon("images/xiaoshou_paihang.png");
		mXsphItem.setIcon(xsphicon);*/
		add(getxscxItem());
		add(getspcxItem());
		add(getxsphItem());
	}
	
	private JMenuItem getxscxItem(){
		return mXscxItem;
	}

	public JMenuItem getspcxItem(){
		return mSpcxItem;
	}
	
	public JMenuItem getxsphItem(){
		return mXsphItem;
	}
}
